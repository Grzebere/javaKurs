package pl.sda.pentle;

import java.util.Scanner;

public class Zadanie2PentlaStr79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n");
        int n = scanner.nextInt();
        System.out.println("Podaj potęgę m");
        int m = scanner.nextInt();
        int potęga = n;
        if (m == 0) {
            potęga = 1;
        } else if (m > 0) {
            for ( int i = 1; i < m; i++ ) {
                potęga *= n;
            }
        } else
            for ( int i = 1; i < m; i++ ) {
                potęga = 1/n;
            }


        System.out.println(potęga);
    }
}
