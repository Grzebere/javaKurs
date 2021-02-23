package pl.sda.domowe.pentle;

import java.util.Scanner;

/*17. Napisać program, który w pętli for oraz while wypisuje:
        a. liczby od -200 do -1000 (pętla która co krok dokonuje dekrementacji).
        b. liczby od 1000 do 100000 w jednej linii, a co 1000 liczbę dodaj wypisanie
        nowej linii.
        c. tabliczkę mnożenia od 5x10
        d. tabliczkę mnożenia a x b - gdzie zmienne a i b załaduj ze scanner’a*/
public class Zadanie17for {
    public static void main(String[] args) {
        System.out.println("a.");
        for ( int i = -200; i >= -1000; i-- ) {
            System.out.println(i);
        }

        System.out.println("b.");
        for ( int i = 1000; i <= 100000; i++ ) {
            System.out.print(i + " ");
            if ((i + 1) % 1000 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("c.");
        for ( int i = 1; i <= 5; i++ ) {
            for ( int j = 1; j <= 10; j++ ) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        System.out.println("d.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = scanner.nextInt();
        System.out.println("podaj liczbę b");
        int b = scanner.nextInt();
        for ( int i = 1; i <= a; i++ ) {
            for ( int j = 1; j <= b; j++ ) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }


    }
}
