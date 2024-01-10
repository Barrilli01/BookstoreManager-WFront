package com.gabrielbarrilli.BookstoreManagerWithFront.repository;

import com.gabrielbarrilli.BookstoreManagerWithFront.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPublished(boolean published);

    List<Book> findByBookNameContaining(String bookName);

    @Query(value = "select * from books b where b.book_author like %:nomeAutor%", nativeQuery = true)
    List<Book> findAllByBookAuthor (@Param("nomeAutor") String nomeAutor);
}
