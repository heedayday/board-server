package com.daybyday.postingBoard.mapper;

import com.daybyday.postingBoard.dto.CategoryDTO;

public interface CategoryMapper {

    //Mapper에도 interface 지정해서 사용하기
    public int register(CategoryDTO categoryDTO);

    public void updateCategory(CategoryDTO categoryDTO);

    public void deleteCategory(int categoryId);

}
