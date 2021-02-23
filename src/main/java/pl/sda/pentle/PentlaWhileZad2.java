package pl.sda.pentle;

import java.util.Scanner;

public class PentlaWhileZad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę n:");
        int liczba = scanner.nextInt();
        int i = 1;
        int suma = 1;

        while (i <= liczba) {
            suma *= i;
            i++;
        }
        System.out.println("Silnia liczby n to: " + suma);
    }
}

