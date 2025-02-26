package org.project.bookstore_server.repository;

import org.project.bookstore_server.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category>findByName(String name);
}
