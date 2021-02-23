package pl.sda.domowe.pentle;
/*Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki. Przykładowo,
  dla liczby 21 dzielniki to: 1, 3, 7, 21*/

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int liczba = scanner.nextInt();
        System.out.println("Dzielniki tej liczby: ");
        for ( int i = 1; i <= liczba; i++ ) {
            if (liczba % i == 0) {
                System.out.println(i);
            }
        }
    }
}
