package com.daybyday.postingBoard.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    // private SortStatus sortStatus; 로 사용
    public enum SortStatus {
        CATEGORIES, NEWEST, OLDEST, HIGHPRICE, LOWPRICE, GRADE
    }
    private int id;
    private String name;
    private SortStatus sortStatus;
    private int searchCount;
    private int pagingStartOffset;

}
