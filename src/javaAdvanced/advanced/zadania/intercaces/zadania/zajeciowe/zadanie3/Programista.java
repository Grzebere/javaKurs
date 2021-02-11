package javaAdvanced.advanced.zadania.intercaces.zadania.zajeciowe.zadanie3;

public class Programista implements Jedzacy {
    protected int maxWaga = 1000;
    protected int aktualnaWaga = 0;
    protected int iloscPosilkow = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.getWaga() <= maxWaga - aktualnaWaga) {
            aktualnaWaga += pokarm.getWaga();
            iloscPosilkow++;
            System.out.println("Programista zjadł");
        } else {
            System.out.println("Programista jest pełen");
        }
    }

    @Override
    public int ilePosilkowZjedzone() {
        return iloscPosilkow;
    }

    @Override
    public int ileGramowZjedzone() {
        return aktualnaWaga;
    }
}
