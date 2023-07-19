package com.ironhack.w2.d2;

import java.util.Objects;

public class Book {
    private long isbn;
    private String title;
    private String author;
    private int pusblishYear;

    public Book(long isbn, String title, String author, int pusblishYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pusblishYear = pusblishYear;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPusblishYear() {
        return pusblishYear;
    }

    public void setPusblishYear(int pusblishYear) {
        this.pusblishYear = pusblishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pusblishYear=" + pusblishYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && pusblishYear == book.pusblishYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, pusblishYear);
    }

    public static Book getHarryPotter() {
        return new Book(1234, "Harry Potter", "J.K. Rowling", 1997);
    }
}
