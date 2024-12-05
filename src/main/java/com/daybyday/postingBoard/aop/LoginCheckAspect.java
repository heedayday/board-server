package com.daybyday.postingBoard.aop;

import com.daybyday.postingBoard.utils.SessionUtil;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;



/*@Component 스프링 Bean 등록하는 방법   참고 링크 : https://dev-wnstjd.tistory.com/440 /  https://velog.io/@dabeen-jung/cs-Spring-Bean-Spring-Bean-%EC%83%9D%EC%84%B1-%EA%B3%BC%EC%A0%95
* @Aspect은 AOP 구현하는 어노테이션 @Around  참고링크 : https://velog.io/@ddongh1122/SpringAOP-%EC%8A%A4%ED%94%84%EB%A7%81-AOP
*  #AOP의  관점의 경우 컨트롤러에 하나씩 다 추가하는 것이 아니라 그 이전의 관점에서 처리함 참고링크: https://life-is-potatoo.tistory.com/54
* @Order 컴포넌트나 빈의 로드 순서를 정의 가능함     참고링크: https://unhosted.tistory.com/79
* @Around 어드바이스의 순서를 지정할 수 있음 이때는 포인트컷을 @annotation으로 지정*/

@Component
@Aspect
@Order(Ordered.LOWEST_PRECEDENCE)
@Log4j2
public class LoginCheckAspect {
    @Around("@annotation(com.daybyday.postingBoard.aop.LoginCheck) && @annotation(loginCheck)")
    public Object adminLoginCheck(ProceedingJoinPoint proceedingJoinPoint, LoginCheck loginCheck) throws Throwable {
        //ProceedingJoinPoint

        //session
        HttpSession session = (HttpSession) ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest().getSession();
        String id = null;
        int idIndex = 0;

        String userType = loginCheck.type().toString();
        log.info("##############"+userType);
        switch (userType) {
            case "ADMIN": {
                id = SessionUtil.getLoginAdminId(session);
                break;
            }
            case "USER": {
                id = SessionUtil.getLoginMemberId(session);
                break;
            }
        }

        if (id == null) {
            log.debug(proceedingJoinPoint.toString()+ "accountName :" + id);
            throw new HttpStatusCodeException(HttpStatus.UNAUTHORIZED, "로그인한 id값을 확인해주세요.") {};
        }

        Object[] modifiedArgs = proceedingJoinPoint.getArgs();

        if(proceedingJoinPoint.getArgs()!=null)
            modifiedArgs[idIndex] = id;

        return proceedingJoinPoint.proceed(modifiedArgs);
    }

}