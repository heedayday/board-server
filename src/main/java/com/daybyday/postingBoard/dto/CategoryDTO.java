package com.daybyday.postingBoard.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    // private SortStatus sortStatus; 로 사용
    //롬북 사용법 https://velog.io/@code-10/%EB%A1%AC%EB%B3%B5-AllNoArgsConstructor-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EC%95%8C%EA%B3%A0-%EC%82%AC%EC%9A%A9%ED%95%B4%EB%B3%B4%EC%9E%90
    public enum SortStatus {
        CATEGORIES, NEWEST, OLDEST, HIGHPRICE, LOWPRICE, GRADE
    }
    private int id;
    private String name;
    private SortStatus sortStatus;
    private int searchCount;
    private int pagingStartOffset;

}
