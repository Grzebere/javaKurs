package pl.sda.obiekty.zadanie1;

public class Main {
    public static void main(String[] args) {
        Osoba ania = new Osoba();
        ania.imie = "Ania";
        ania.rokUrodznia = 1996;
        Osoba andrzej = new Osoba();
        andrzej.imie = "Aandrzej";
        andrzej.rokUrodznia = 1956;
        Osoba mariola = new Osoba();
        mariola.imie = "Mariola";
        mariola.rokUrodznia = 1935;

        Osoba arkadiusz = new Osoba("Arkadiusz", 1990);

        ania.przedstawSie();
        andrzej.przedstawSie();
        mariola.przedstawSie();
        arkadiusz.przedstawSie();


    }
}
