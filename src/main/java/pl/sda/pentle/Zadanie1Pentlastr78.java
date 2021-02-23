package pl.sda.pentle;

import java.util.Scanner;

public class Zadanie1Pentlastr78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzielnik!");
        int dzielnik = scanner.nextInt();
        System.out.println("podaj liczbę!");
        int liczba = scanner.nextInt();
        scanner.nextLine();
        ;


        for ( int i = 1; i < liczba; i++ ) {
            if (i % dzielnik == 0) {
                System.out.println(i);
            }
        }

    }
}
