package javaAdvanced.advanced.zadania.podsumowanieWstepu.zadanie;
// Przerobić Bibliotekę aby uninać puste pola dla wyszukiwania
public class Main {
    public static void main(String[] args) {


        Autor author1 = new Autor("Boris");
        Autor author2 = new Autor("Adam");

        Książka książka1 = new Książka("Kniga", author1);
        Książka książka2 = new Książka("Apple", author2);

        Czasopismo czasopismo = new Czasopismo("Apple", author1);

        Biblioteka biblioteka = new Biblioteka(10, książka1, książka2, czasopismo);

        System.out.println(biblioteka.authorWithTheMostCopy());
        System.out.println(biblioteka.searchByAuthor("Boris"));

    }
}
