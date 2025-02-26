package org.project.bookstore_server.mapper;

import org.project.bookstore_server.entity.Book;
import org.project.bookstore_server.model.book.BookDto;

public interface BookMapper {
       BookDto toDto(Book book);
       Book toEntity(BookDto bookDto);
}
