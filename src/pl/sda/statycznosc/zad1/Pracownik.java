package pl.sda.statycznosc.zad1;

public class Pracownik {
    public void wejdzDoBiura() {
        Biuro.setLiczbaOsobWewnatrz(Biuro.getLiczbaOsobWewnatrz()+1);
        if (Biuro.getLiczbaOsobWewnatrz() >= 0) {
            System.out.println("Aktualna liczba ludzi w biurze: " + Biuro.getLiczbaOsobWewnatrz());
        } else {
            System.out.println("Błąd!!! Nie może być ujemnej liczby osób w biurze");
        }
    }

    public void wyjdzZBiura() {
        Biuro.setLiczbaOsobWewnatrz(Biuro.getLiczbaOsobWewnatrz()-1);
        if (Biuro.getLiczbaOsobWewnatrz() >= 0) {
            System.out.println("Aktualna liczba ludzi w biurze: " + Biuro.getLiczbaOsobWewnatrz());
        } else {
            System.out.println("Błąd!!! Nie może być ujemnej liczby osób w biurze");
        }
    }
}
