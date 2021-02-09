package pl.sda.domowe.pentle;
/*9. Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
        (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych
        wartości. Jeżeli podana wartość jest:
        a. większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
        b. mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
        c. identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra się
        kończy.*/

import java.util.Random;
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int liczba = random.nextInt(100);
        int strzal;
        System.out.println("Zagadnil wylosowaną liczbę z zakeresu (0-100)");
        while (true) {
            System.out.println("Podaj liczbę:");
            strzal = scanner.nextInt();
            if (strzal == liczba) {
                System.out.println("Gratulacje");
                break;
            }
            if (strzal > liczba) {
                System.out.println("Podałeś za dużą wartość");
            }
            if (strzal < liczba) {
                System.out.println("Podałeś za małą wartość");
            }
        }


    }
}
