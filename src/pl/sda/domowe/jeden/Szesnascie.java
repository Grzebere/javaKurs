package pl.sda.domowe.jeden;

/*16. Napisz aplikację, która losuje liczbę A. Następnie zadaj użytkownikowi pytanie: “Czy
        liczba A > 100”. Użytkownik musi odpowiedzieć “Tak” lub “Nie”. Po udzieleniu
        odpowiedzi przez użytkownika zweryfikuj ją (sprawdź czy jest poprawna) i wypisz
        komunikat: “Ta odpowiedź jest poprawna”, lub “Ta odpowiedź nie jest poprawna”.*/


import java.util.Random;
import java.util.Scanner;

public class Szesnascie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("Czy liczba A: " + a + " > 100? (Tak/Nie)");
        String odpowiedz = scanner.nextLine();
        if (odpowiedz.equals("Tak")) {
            if (a > 100) {
                System.out.println("Ta odpowiedź jest poprawna");
            } else {
                System.out.println("Ta odpowiedź nie jest poprawna");
            }
        } else if (odpowiedz.equals("Nie")) {
            if (!(a > 100)) {
                System.out.println("Ta odpowiedź jest poprawna");
            } else {
                System.out.println("Ta odpowiedź nie jest poprawna");
            }
        } else {
            System.out.println("Zły format odpowiedzi.");
        }


    }

}
