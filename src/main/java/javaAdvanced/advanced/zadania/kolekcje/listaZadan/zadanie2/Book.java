package javaAdvanced.advanced.zadania.kolekcje.listaZadan.zadanie2;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private int year, price;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, int price, int year, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.authors = authors;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(price, book.price) &&
                Objects.equals(authors, book.authors) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, year, authors, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public static Comparator<Book> titleComparatorAsc = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            String title1 = o1.getTitle().toLowerCase();
            String title2 = o2.getTitle().toLowerCase();

            return title1.compareTo(title2);
        }

    };

    public static Comparator<Book> titleComparatorDes = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            String title1 = o1.getTitle().toLowerCase();
            String title2 = o2.getTitle().toLowerCase();

            return title2.compareTo(title1);
        }
    };
}
    class SortByPrice implements Comparator<Book>{

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getPrice()-o2.getPrice();
        }
    }

