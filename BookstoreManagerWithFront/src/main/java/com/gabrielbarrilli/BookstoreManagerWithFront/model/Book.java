package com.gabrielbarrilli.BookstoreManagerWithFront.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_chapters")
    private Integer bookChapters;

    @Column(name = "book_pages")
    private Integer bookPages;

    @Column(name = "book_published")
    private boolean published;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, Integer bookChapters, Integer bookPages, boolean published) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookChapters = bookChapters;
        this.bookPages = bookPages;
        this.published = published;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Integer getBookChapters() {
        return bookChapters;
    }

    public void setBookChapters(Integer bookChapters) {
        this.bookChapters = bookChapters;
    }

    public Integer getBookPages() {
        return bookPages;
    }

    public void setBookPages(Integer bookPages) {
        this.bookPages = bookPages;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookChapters=" + bookChapters +
                ", bookPages=" + bookPages +
                ", published=" + published +
                '}';
    }
}
