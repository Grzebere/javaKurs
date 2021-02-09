package pl.sda.enumy.enumy0;

public enum Bilet {

    ULGOWY_GODZINNY(2.20, 60),
    ULGOWY_CALODNIOWY(6.50, 60 * 24),
    NORMALNY_GODZINNY(4.40, 60),
    NORMALNY_CALODNIOWY(13.0, 60 * 24),
    BRAK_BILETU(0, 0);


    private double cena;
    private int minutyJazdy;

    Bilet(double cena, int minutyJazdy) {
        this.cena = cena;
        this.minutyJazdy = minutyJazdy;
    }

    public double pobierzCeneBiletu() {
        return this.cena;
    }

    public int pobierzCzasJazdy() {
        return this.minutyJazdy;
    }

    public void wyswietlDaneOBilecie() {
        if (this == ULGOWY_GODZINNY) {
            System.out.println("Bilet ulgowy 1-godzinny");
        } else if (this == ULGOWY_CALODNIOWY) {
            System.out.println("Bilet ulgowy 24-godzinny");
        } else if (this == NORMALNY_GODZINNY) {
            System.out.println("Bilet normalny 1-godzinny");
        } else if (this == NORMALNY_CALODNIOWY) {
            System.out.println("Bilet normalny 24-godzinny");
        } else if (this == BRAK_BILETU) {
            System.out.println("Brak biletu");
        }
    }

    public static Bilet zwrocWlasciwyBilet(int wiek, int minutyJazdy, double kwota) {
        if (wiek < 26) {
            if (minutyJazdy > 0 && minutyJazdy <= Bilet.ULGOWY_GODZINNY.pobierzCzasJazdy()) {
                if (kwota >= ULGOWY_GODZINNY.pobierzCeneBiletu()) {
                    return ULGOWY_GODZINNY;
                } else {
                    return BRAK_BILETU;
                }
            } else if (minutyJazdy > ULGOWY_GODZINNY.pobierzCzasJazdy() && minutyJazdy <= ULGOWY_CALODNIOWY.pobierzCzasJazdy()) {
                if (kwota >= ULGOWY_CALODNIOWY.pobierzCeneBiletu()) {
                    return ULGOWY_CALODNIOWY;
                } else {
                    return BRAK_BILETU;
                }
            } else {
                return BRAK_BILETU;
            }
        } else {
            if (minutyJazdy > 0 && minutyJazdy <= Bilet.NORMALNY_GODZINNY.pobierzCzasJazdy()) {
                if (kwota >= NORMALNY_GODZINNY.pobierzCeneBiletu()) {
                    return NORMALNY_GODZINNY;
                } else {
                    return BRAK_BILETU;
                }
            } else if (minutyJazdy > NORMALNY_GODZINNY.pobierzCzasJazdy() && minutyJazdy <= NORMALNY_CALODNIOWY.pobierzCzasJazdy()) {
                if (kwota >= NORMALNY_CALODNIOWY.pobierzCeneBiletu()) {
                    return NORMALNY_CALODNIOWY;
                } else {
                    return BRAK_BILETU;
                }
            } else {
                return BRAK_BILETU;
            }
        }


    }


}
