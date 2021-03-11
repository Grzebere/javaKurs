package javaAdvanced.advanced.zadania.wyjatki.zadanie2;

public class Book {
    String isbn, title, author;
    int yearOfPublish;

    public Book(String isbn, String title, String author, int yearOfPublish) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                '}';
    }
}
