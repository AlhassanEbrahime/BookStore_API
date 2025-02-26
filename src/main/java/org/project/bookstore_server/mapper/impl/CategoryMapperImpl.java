package org.project.bookstore_server.mapper.impl;

import org.project.bookstore_server.entity.Category;
import org.project.bookstore_server.mapper.CategoryMapper;
import org.project.bookstore_server.model.category.CategoryDto;

public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto toDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName(category.getName());
        categoryDto.setDescription(category.getDescription());

        return categoryDto;
    }

    @Override
    public Category toEntity(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return category;
    }
}
