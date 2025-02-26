package org.project.bookstore_server.mapper;

import org.project.bookstore_server.entity.Category;
import org.project.bookstore_server.model.category.CategoryDto;

public interface CategoryMapper {
    CategoryDto toDto(Category category);

    Category toEntity(CategoryDto categoryDto);
}
