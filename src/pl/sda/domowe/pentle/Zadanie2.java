package pl.sda.domowe.pentle;
/*2. Napisz aplikację która przyjmuje parametr (ilość powtórzeń) ze scannera, a
        następnie zadaną ilość razy wypisuje na ekran “Hello World” - pętlą for i while*/

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ilość_powtorzen = scanner.nextInt();
        System.out.println("Pętla 'for':");
        for ( int i = 0; i < ilość_powtorzen; i++ ) {
            System.out.println("Hello World");
        }
        System.out.println("Pętla 'while':");
        int j = 0;
        while (j < ilość_powtorzen) {
            System.out.println("Hello World");
            j++;
        }


    }
}
