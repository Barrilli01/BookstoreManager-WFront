package com.gabrielbarrilli.BookstoreManagerWithFront.repository;

import com.gabrielbarrilli.BookstoreManagerWithFront.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPublished(boolean published);

    List<Book> findByBookNameContaining(String bookName);
}
