package pl.sda.domowe.jeden;

import java.util.Scanner;

public class Dwanascie {
    /*12. (Wymaga umiejętności korzystania ze Scanner’a). Zmodyfikuj zadanie z
    rollercoasterem. Pobierz parametry waga, wzrost, wiek od użytkownika. Zweryfikuj
    poprawność danych (większe od zera itp.), a następnie sprawdź czy Twoja aplikacja
    działa poprawnie.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wagę");
        int waga = scanner.nextInt();
        scanner.nextLine();
        if (waga < 0) {
            System.out.println("Wprowadzono niewłaściwą wagę");
            return;
        }
        System.out.println("Wprowadz wzrost");
        int wzrost = scanner.nextInt();
        scanner.nextLine();
        if (wzrost < 0) {
            System.out.println("Wprowadzono niewłaściwy wzrost");
            return;
        }
        System.out.println("Wprowadz wiek");
        int wiek = scanner.nextInt();
        scanner.nextLine();
        if (wiek < 0) {
            System.out.println("Wprowadzono niewłaściwy wiek");
            return;
        }
        if (wzrost > 220) {
            System.out.println("Nie możesz wejść na kolejkę ponieważ jesteś za wysoki/a");
        } else if (wzrost < 150) {
            System.out.println("Nie możesz wejść na kolejkę ponieważ jesteś za niski/a");
        } else if (waga > 160) {
            System.out.println("Nie możesz wejść na kolejkę bo przekracza limit wagowy");
        } else if (wiek < 10 || wiek > 80) {
            System.out.println("Nie możesz wejść na kolejkę poniważ nie spełniasz wymagań wiekowych");
        } else {
            System.out.println("Zapraszamy");

        }

    }
}
