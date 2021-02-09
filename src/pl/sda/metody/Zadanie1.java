package pl.sda.metody;

public class Zadanie1 {

    public static void main(String[] args) {
        drukujParzytoscLiczby(5);

    }

    public  static boolean czyLiczbaJestParzysta(int liczba) {
        return (liczba % 2 == 0);
    }

    public static void drukujParzytoscLiczby(int liczba) {
        if (czyLiczbaJestParzysta(liczba)) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba jest nieparzysta");
        }
    }
}
