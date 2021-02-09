package pl.sda.pentle;

import java.util.Scanner;

public class PentlaWhileZad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę:");
        int liczba = scanner.nextInt();
        int i = 0;
        int suma = 0;

        while (i <= liczba) {
            suma += i;
            i++;
        }
        System.out.println("Suma liczb to: " + suma);
    }
}
