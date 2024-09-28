package com.daybyday.postingBoard.mapper;

import com.daybyday.postingBoard.dto.CategoryDTO;

public interface CategoryMapper {
    public int register(CategoryDTO categoryDTO);

    public void updateCategory(CategoryDTO categoryDTO);

    public void deleteCategory(int categoryId);
}
