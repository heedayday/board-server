package com.daybyday.postingBoard.exception;

public class DuplicateIdException extends RuntimeException {
  //사용자 정의 예외 이때 extends RuntimeException 가 포인트
  public DuplicateIdException(String msg) {
    super(msg);
  }

}
