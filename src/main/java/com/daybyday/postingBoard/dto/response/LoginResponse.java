package com.daybyday.postingBoard.dto.response;

import com.daybyday.postingBoard.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/*여기는 롬북을 사용하는 케이스 https://velog.io/@code-10/%EB%A1%AC%EB%B3%B5-AllNoArgsConstructor-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EC%95%8C%EA%B3%A0-%EC%82%AC%EC%9A%A9%ED%95%B4%EB%B3%B4%EC%9E%90*/

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class LoginResponse {

    enum LoginStatus {
        SUCCESS, FAIL, DELETED
    }

    @NonNull
    private LoginStatus result;
    private UserDTO userDTO;

    private static final LoginResponse FAIL = new LoginResponse(LoginStatus.FAIL);

    public static LoginResponse success(UserDTO userDTO) {
        return new LoginResponse(LoginStatus.SUCCESS, userDTO);
    }
    
}
