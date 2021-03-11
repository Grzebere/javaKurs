package javaAdvanced.advanced.zadania.wyjatki.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookRepository {
    List<Book> repository;

    public BookRepository() {
        this.repository = new ArrayList<>();
    }

    public void add (Book book){
        repository.add(book);
    }

    public void remove (Book book){
        repository.remove(book);
    }

    public Book searchByTitle (String title){
        for ( Book book: repository ) {
            if(title.equalsIgnoreCase(book.title)){
                return book;
            }
        }
        throw new NoBookFoundExeption(title);
    }

    public Book searchById (int id){
        if (id> repository.size()){
            throw new NoBookFoundExeption(Integer.toString(id));
        } else{
            return repository.get(id);
        }
    }
    public Book removeById (int id){
        if (id> repository.size()){
            throw new NoBookFoundExeption(Integer.toString(id));
        } else{
            return repository.remove(id);
        }
    }


}
