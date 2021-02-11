package javaAdvanced.advanced.zadania.intercaces.zadania.zajeciowe.zadanie3;

public class Krokodyl implements Jedzacy {
    protected int maxWaga = 5000;
    protected int aktualnaWaga = 0;
    protected int iloscPosilkow = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.getWaga() + aktualnaWaga <= maxWaga  && pokarm.getTypPokarmu() == TypPokarmu.MIESO) {
            aktualnaWaga +=pokarm.getWaga();
            iloscPosilkow++;
            System.out.println("Krokodyl zjadł");
        } else if (pokarm.getWaga() + aktualnaWaga > maxWaga) {
            System.out.println("Krokodyl jest pełen");
        } else {
            System.out.println("Krokodyl nie zje bezmięsny pokarm");
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
