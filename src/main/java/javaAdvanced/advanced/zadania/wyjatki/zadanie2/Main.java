package javaAdvanced.advanced.zadania.wyjatki.zadanie2;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        bookRepository.add(new Book("11A1", "ops", "Ali", 1932));
        bookRepository.add(new Book("11A3", "ops1", "Ali3", 1938));
        bookRepository.add(new Book("22A1", "ops2", "Ali", 1962));
        bookRepository.searchById(4);
    }





}
