package Homework12;

import java.util.Objects;

public class Book {
    private String name;

    public int getPublishingYear() {
        return publishingYear;
    }
    private Author author;

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public Book() {}

    public Book(String name, int publishingYear, Author author) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    private int publishingYear;
    public String getName() {
        return name;
    }
    public  void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishingYear);
    }
}
