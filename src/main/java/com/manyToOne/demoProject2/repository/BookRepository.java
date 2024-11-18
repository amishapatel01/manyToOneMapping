package com.manyToOne.demoProject2.repository;


import com.manyToOne.demoProject2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
