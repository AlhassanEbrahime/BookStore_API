package org.project.bookstore_server.mapper.impl;

import org.project.bookstore_server.entity.Book;
import org.project.bookstore_server.mapper.BookMapper;
import org.project.bookstore_server.model.book.BookDto;
import org.project.bookstore_server.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class BookMapperImpl implements BookMapper {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public BookDto toDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setAuthor(book.getAuthor());
        bookDto.setAvailable(book.isAvailable());
        bookDto.setTitle(book.getTitle());
        bookDto.setDescription(book.getDescription());
        bookDto.setCategoryId(book.getCategory().getId());

        return bookDto;
    }

    @Override
    public Book toEntity(BookDto bookRequestDTO) {
        Book book = new Book();
        book.setAuthor(bookRequestDTO.getAuthor());
        book.setAvailable(bookRequestDTO.isAvailable());
        book.setPublishDate(LocalDateTime.now());
        book.setTitle(bookRequestDTO.getTitle());
        book.setDescription(bookRequestDTO.getDescription());
        var category = categoryRepository.findById(bookRequestDTO.getCategoryId()).orElse(null);
        book.setCategory(category);
        return book;
        }

}