package pl.sda.domowe.tablice;

import java.util.Random;

/*
2. Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10 a
następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w
tablicy.Przykład:
        Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
        Wystąpienia:
        1 - 1
        2 - 1
        3 - 3
        4 - 3
        5 - 3
        6 - 4
        7 - 1
        8 - 2
        9 - 0
        10 - 2*/
public class Zadanie2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[20];
        int count = 0;
        System.out.print("Wylosowane liczby:");
        for ( int i = 0; i < tablica.length; i++ ) {
            tablica[i] = random.nextInt(10) + 1;
            System.out.print(" " + tablica[i]);
        }
        System.out.println();
        System.out.println("Wystąpienia: ");
        for ( int i = 1; i <= 10; i++ ) {
            for ( int j = 0; j < tablica.length; j++ ) {
                if (i == tablica[j]) {
                    count++;
                }
            }
            System.out.println(i + " - " + count);
            count = 0;
        }

    }

}
