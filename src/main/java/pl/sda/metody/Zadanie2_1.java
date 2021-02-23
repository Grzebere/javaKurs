package pl.sda.metody;

import java.util.Scanner;

public class Zadanie2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia");
        drukujPodzielnoscLiczby(scanner.nextInt());

    }

    public static boolean czyLiczbaJestPodzienlaPrzez3(int liczba) {
        return (liczba % 3 == 0);
    }

    public static boolean czyLiczbaJestPodzienlaPrzez5(int liczba) {
        return (liczba % 5 == 0);
    }

    public static int podzielnePrzez3CzyPrzez5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz sprawdzsić czy liczba jest podzielna przez 3 czy przez 5?");
        int dzielnik = scanner.nextInt();
        return dzielnik;

    }

    public static void drukujPodzielnoscLiczby(int liczba) {
        int dzielnik = podzielnePrzez3CzyPrzez5();
        switch (dzielnik) {
            case (3):
                if (czyLiczbaJestPodzienlaPrzez3(liczba)) {
                    System.out.println("liczba jest podzielna przez 3");
                } else {
                    System.out.println("liczba jest nie podzielna przez 3");
                }
                break;
            case (5):
                if (czyLiczbaJestPodzienlaPrzez5(liczba)) {
                    System.out.println("liczba jest podzielna przez 5");
                } else {
                    System.out.println("liczba jest nie podzielna przez 5");
                }
                break;
            default:
                System.out.println("Podano błedny dzielnik");


        }
    }
}

