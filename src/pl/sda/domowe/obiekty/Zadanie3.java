package pl.sda.domowe.obiekty;

/*zad 3
        Stwórz klasę RachunekBankowy która posiada pola:
        - numer konta
        - ilość środków na koncie
        - imie i nazwisko właściciela
        stwórz w klasie metody:
        - gettery do wszystkich pól (nie settery - wiesz dlaczego?)
        - wykonajPrzelewPrzychodzący(double kwota):void
        - wykonajPrzelewWychodzący(double kwota):void
        (metody odejmują lub dodają na konto podaną ilość pieniędzy)
        Stwórz klasę Bank która posiada jako pola:
        - nazwę banku
        - tablicę kont bankowych
        stwórz w klasie metody:
        - wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu)*/
public class Zadanie3 {
    public class RachunekBankowy {
        String numerKonta;
        double srodkiNaKoncie;
        String wlascicel;

        public String getNumerKonta() {
            return numerKonta;
        }

        public double getSrodkiNaKoncie() {
            return srodkiNaKoncie;
        }

        public String getWlascicel() {
            return wlascicel;
        }

        void wykonajPrzelewPrzychodzący(double kwota) {
            srodkiNaKoncie += kwota;
        }

        void wykonajPrzelewWychodzący(double kwota) {
            srodkiNaKoncie -= kwota;
        }
    }

    public class Bank {
        String nazwa;
        RachunekBankowy[] konta = new RachunekBankowy[10];

        void wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu) {
            for ( int i = 0; i < konta.length; i++ ) {
                if (numerKontaZ.equals(konta[i].getNumerKonta())) {
                    for ( int j = 0; j < konta.length; j++ ) {
                        if (numerKontaNa.equals(konta[j].getNumerKonta())) {
                            konta[i].wykonajPrzelewWychodzący(kwotaPrzelewu);
                            konta[j].wykonajPrzelewPrzychodzący(kwotaPrzelewu);
                        }
                    }
                }
            }
        }

    }


}
