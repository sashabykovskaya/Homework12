import Homework12.Author;
import Homework12.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Author author = new Author("Джоанн", "Харрис");
        book1.setName("Ежевичное вино");
        System.out.println("Название книги - " + book1.getName());
        book1.setPublishingYear(1999);
        System.out.println("Год публикации: " + book1.getPublishingYear());

        Author author2 = new Author("Лев", "Толстой");
        System.out.println(author);
        Book book2 = new Book("Война и мир. Том 2", 1867, author2);
        System.out.println(book2);

        System.out.println(author.hashCode());
        System.out.println(book2.hashCode());
        System.out.println("Ежевичное вино == Война и мир " + (book1 == book2));
        System.out.println("Ежевичное вино.equals(Война и мир) " + book1.equals(book2));
    }
}