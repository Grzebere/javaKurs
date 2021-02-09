package pl.sda.enumy.enumy0;

public class Main {

    public static void main(String[] args) {
        Bilet ulgowygodzinny = Bilet.ULGOWY_GODZINNY;
        Bilet ulgowydobowy = Bilet.ULGOWY_CALODNIOWY;
        Bilet normalnygodzinny = Bilet.NORMALNY_GODZINNY;
        Bilet normalnydobowy = Bilet.NORMALNY_CALODNIOWY;
        Bilet brak = Bilet.BRAK_BILETU;

        ulgowydobowy.wyswietlDaneOBilecie();
        ulgowygodzinny.wyswietlDaneOBilecie();
        normalnydobowy.wyswietlDaneOBilecie();
        normalnygodzinny.wyswietlDaneOBilecie();
        brak.wyswietlDaneOBilecie();

        Bilet nowy = Bilet.zwrocWlasciwyBilet(33, 33, 33);
        nowy.wyswietlDaneOBilecie();

    }
}
