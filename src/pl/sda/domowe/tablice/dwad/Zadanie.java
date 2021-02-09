package pl.sda.domowe.tablice.dwad;

public class Zadanie {// Tworzenie tablicy

    public static void main(String[] args) {

        int[][] tablica2D = new int[10][10];
        for ( int i = 0; i < 10; i++ ) {
// pętla wewnętrzna generuje indeksy kolumn
            for ( int j = 0; j < 10; j++ ) {
// możemy tak wyliczyć kolejną liczbę, ponieważ
// każdy rząd odpowiada kolejnej dziesiątce
                tablica2D[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println();

    }
}
