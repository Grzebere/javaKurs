package pl.sda.domowe.pentle;

import java.util.Scanner;

/*17. Napisać program, który w pętli for oraz while wypisuje:
        a. liczby od -200 do -1000 (pętla która co krok dokonuje dekrementacji).
        b. liczby od 1000 do 100000 w jednej linii, a co 1000 liczbę dodaj wypisanie
        nowej linii.
        c. tabliczkę mnożenia od 5x10
        d. tabliczkę mnożenia a x b - gdzie zmienne a i b załaduj ze scanner’a*/
public class Zadanie17while {
    public static void main(String[] args) {
        System.out.println("a.");
        int i = -200;
        while (i >= -1000) {
            System.out.println(i);
            i--;
        }

        System.out.println("b.");
        i = 1000;
        while (i <= 100000) {
            System.out.print(i + " ");
            if ((i + 1) % 1000 == 0) {
                System.out.println();

            }
            i++;
        }
        System.out.println();

        System.out.println("c.");
        i = 1;
        int j = 1;
        while (i <= 5) {
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }

        System.out.println("d.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = scanner.nextInt();
        System.out.println("podaj liczbę b");
        int b = scanner.nextInt();
        i = 1;
        while (i <= a) {
            while (j <= b) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }


    }
}
