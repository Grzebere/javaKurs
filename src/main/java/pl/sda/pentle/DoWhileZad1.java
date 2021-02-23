package pl.sda.pentle;

import java.util.Scanner;

public class DoWhileZad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Wpisz liczbę: ");
            n = scanner.nextInt();
            for ( int i = 1; i < n; i++ ) {
                System.out.println(i);
            }
        } while (n > 0);
    }
}
