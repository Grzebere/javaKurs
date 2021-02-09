package pl.sda.obiekty.zadanie1;

import java.util.Calendar;

public class Osoba {
    String imie;
    int rokUrodznia;

    public Osoba(){};

    public Osoba(String imie, int rokUrodznia ) {
        this.imie = imie;
        this.rokUrodznia = rokUrodznia;
    }

    public Osoba(int rokUrodznia, String imie) {
        this.imie = imie;
        this.rokUrodznia = rokUrodznia;
    }

    public Osoba(int rokUrodznia) {
        this.rokUrodznia = rokUrodznia;
    }

    public Osoba(String imie) {
        this.imie = imie;
    }

    public void przedstawSie() {
        System.out.println("NCześć! Mam na imię  " + imie + " i mam " + (Calendar.getInstance().get(Calendar.YEAR) - rokUrodznia));
    }


}
