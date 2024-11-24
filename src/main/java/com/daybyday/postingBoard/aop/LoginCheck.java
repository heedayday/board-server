package com.daybyday.postingBoard.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LoginCheck {
    public static enum UserType {
        USER, ADMIN
    }

    //해당부분이 사용되는 용도 확인하기
    UserType type();
}

