package pl.sda.domowe.tabliceIPentleRozne;

import java.util.Random;
import java.util.Scanner;

/*14. Napisz program symulujący pracę dystrybutora paliwa, gdzie użytkownik otrzymuje informację o ilości wlanego paliwa oraz o cenie jaką musi zapłacić. Aplikacja pyta użytkownika czy chce kontynuować napełnianie baku
        a. ‘t’ oznacza kontynuację
        b. ‘n’ oznacza zakończenie tankowania
        Po zakończeniu procesu tankowania wyświetlone zostaje sprawozdanie zawierające ilość przelanego paliwa oraz cenę za paliwo liczoną w złotówkach. Wykorzystaj double do przechowania ceny paliwa. Dodatkowo użyj random,
        aby przy kolejnej iteracji dolać do zbiornika losową ilość paliwa, która wygeneruje odpowiedni dodatek do rachunku*/
public class Zadanie14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int wlane = 0;
        double kosztZaLitr = 4.14d;
        double koszt = 0;
        boolean koniec = false;

        while (koniec == false) {
            System.out.println("Ilośc wlanego paliwa: " + wlane + "\n" + "Do zapłaty: " + koszt);
            System.out.println("Czy chcesz kontynuować?(t/n)");
            String kontynuacja = scanner.nextLine();
            switch (kontynuacja) {
                case ("t"):
                    wlane += random.nextInt(10);
                    koszt = wlane * kosztZaLitr;
                    break;
                case ("n"):
                    System.out.println("Ilośc wlanego paliwa: " + wlane + "\n" + "Do zapłaty: " + koszt);
                    koniec = true;
                    break;
                default:
                    System.out.println("Błędna odpowidź");
                    break;

            }
        }


    }
}
