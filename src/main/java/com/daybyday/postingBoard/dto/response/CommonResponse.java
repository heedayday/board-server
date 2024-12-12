package com.daybyday.postingBoard.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {
/*    제네릭 https://st-lab.tistory.com/153*/

    private HttpStatus status;
    private String code;
    private String message;
    private T requestBody;

}