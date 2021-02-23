package javaAdvanced.advanced.zadania.kolekcje.listaZadan.zadanie2;

import java.util.*;

public class BookService {
    protected List<Book> bookList;

    public BookService() {
        this.bookList = new ArrayList<Book>();
    }

    public boolean addBook(Book book) {
        return bookList.add(book);
    }

    public void removeBooksByTitle(String title) {
        for ( int i = 0; i < bookList.size(); i++ ) {
            if (title.equalsIgnoreCase(bookList.get(i).getTitle())) {
                bookList.remove(i);
            }
        }
    }

    public Book removeBook(int index) {
        return bookList.remove(index);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getFantasyBookList() {
        List<Book> fantasyBooks = new ArrayList<Book>();
        for ( int i = 0; i < bookList.size(); i++ ) {
            if (bookList.get(i).getGenre() == Genre.FANTASY) {
                fantasyBooks.add(bookList.get(i));
            }
        }
        return fantasyBooks;
    }

    public List<Book> getBookListFromBefore1999() {
        List<Book> oldBooks = new ArrayList<Book>();
        for ( int i = 0; i < bookList.size(); i++ ) {
            if (bookList.get(i).getYear() < 1999) {
                oldBooks.add(bookList.get(i));
            }
        }
        return oldBooks;
    }

    public Book getMostExpeciveBook() {
        Book expeciveBook = bookList.get(0);
        if (bookList.size() > 1) {
            for ( int i = 1; i < bookList.size(); i++ ) {
                if (bookList.get(i).getPrice() > bookList.get(i - 1).getPrice()) {
                    expeciveBook = bookList.get(i);
                }
            }
        }
        return expeciveBook;
    }

    public Book getCheapestBook() {
        Book cheapBook = bookList.get(0);
        if (bookList.size() > 1) {
            for ( int i = 1; i < bookList.size(); i++ ) {
                if (bookList.get(i).getPrice() < bookList.get(i - 1).getPrice()) {
                    cheapBook = bookList.get(i);
                }
            }
        }
        return cheapBook;
    }

    public List<Book> getBookWithAtLeasNAuthors(int n) {
        List<Book> booksWithNAuthors = new ArrayList<Book>();
        for ( int i = 0; i < bookList.size(); i++ ) {
            if (bookList.get(i).getAuthors().size() >= n) {
                booksWithNAuthors.add(bookList.get(i));
            }
        }
        return booksWithNAuthors;
    }


    public void sortBooks(String ascOrDes) {
        switch (ascOrDes) {
            case "ascending":
                Collections.sort(bookList, Book.titleComparatorAsc);
                break;
            case "descending":
                Collections.sort(bookList, Book.titleComparatorDes);
                break;
            default:
        }
    }

    public boolean isTheBookTitleOnList(String bookTitle) {
        for ( Book book : bookList ) {
            if (book.getTitle().equals(bookTitle)){
                return true;
            }
        }
        return false;
    }

    public List<Book> booksOfAuthor(String author) {
        List<Book> booksOfAuthor = new ArrayList<Book>();

        for ( Book book : bookList ) {
            for ( int i = 0; i <book.getAuthors().size() ; i++ ) {
                if (book.getAuthors().get(i).getName().equalsIgnoreCase(author)){
                    booksOfAuthor.add(book);
                }
            }
        }

        return booksOfAuthor;
    }

    public Map<Genre, String> getSenselessMap(){
        Map<Genre, String> map = new HashMap<Genre, String>();
        for ( Book book: bookList ) {
            map.put(book.getGenre(), book.getTitle());
        }
        return map;
    }

    public Stack getSortedStackByPrice(){
        Stack<Book> stackOfBooks = new Stack<Book>();
        stackOfBooks.addAll(bookList);
        Collections.sort(stackOfBooks, new SortByPrice());
        return stackOfBooks;
    }

}




