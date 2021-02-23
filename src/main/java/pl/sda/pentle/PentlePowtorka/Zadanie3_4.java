package pl.sda.pentle.PentlePowtorka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie3_4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int liczba = scanner.nextInt();

        do {
            a += liczba;
            System.out.println("Dotychczasowa suma: " + a);
            try {
                liczba = scanner.nextInt();
            } catch (InputMismatchException e) {
                break;
            }
        } while (liczba > 0 || liczba < 0);

    }
}
