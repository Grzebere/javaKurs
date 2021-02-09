package pl.sda.pentle;

import java.util.Scanner;

public class PentlaWhileLiczbyPierwsze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = scanner.nextInt();
        int i = 2;

        while (i <= n) {
            if (n == i) {
                System.out.println("To jest liczba pierwsza");
            } else if (n % i == 0) {
                System.out.println("To nie jest liczba pierwsza");
                break;
            }
            i++;
        }
    }


}

