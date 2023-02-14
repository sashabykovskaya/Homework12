package Homework12;

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
}
