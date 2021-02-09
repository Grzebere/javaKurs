package pl.sda.obiektynosc;

import java.util.Calendar;

public class Osoba {

    String imie;
    int rokUrodznia;
    char plec;

    public Osoba(){};

    public Osoba(String imie, int rokUrodznia ,char plec) {
        this.imie = imie;
        this.rokUrodznia = rokUrodznia;
        this.plec = plec;
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
        System.out.println("Cześć! Mam na imię  " + imie + " i mam " + (Calendar.getInstance().get(Calendar.YEAR) - rokUrodznia));
    }
}
