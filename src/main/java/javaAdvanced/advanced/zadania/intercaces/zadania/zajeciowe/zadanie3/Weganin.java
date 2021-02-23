package javaAdvanced.advanced.zadania.intercaces.zadania.zajeciowe.zadanie3;

public class Weganin implements Jedzacy {
    protected int maxWaga = 1000;
    protected int aktualnaWaga = 0;
    protected int iloscPosilkow = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.getWaga() + aktualnaWaga <= maxWaga  && pokarm.getTypPokarmu() == TypPokarmu.OWOCE) {
            aktualnaWaga +=pokarm.getWaga();
            iloscPosilkow++;
            System.out.println("Wganin zjadł");
        } else if (pokarm.getWaga() + aktualnaWaga > maxWaga) {
            System.out.println("Weganin jest pełen");
        } else {
            System.out.println("Weganin nie zje produktów pochodzenia zwierzęcego");
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
