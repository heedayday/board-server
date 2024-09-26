package com.heeday.mainboard.mapper;

import com.heeday.mainboard.dto.CategoryDTO;

public interface CategoryMapper {
    public int register(CategoryDTO productDTO);

    public void updateCategory(CategoryDTO categoryDTO);

    public void deleteCategory(int categoryId);
}
