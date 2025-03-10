package org.project.bookstore_server.repository;

import org.project.bookstore_server.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByTitle(String title);

    List<Book> findByCategoryId(Long categoryId);

    List<Book> findByCategoryName(String categoryName);

}
