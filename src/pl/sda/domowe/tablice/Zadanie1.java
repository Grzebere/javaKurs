package pl.sda.domowe.tablice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//1. Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
//        a. wypełnij je losowymi wartościami z przedziału -10 - 10
//        b. wypisz na ekranie zawartość tablicy
//        c. wyznacz najmniejszy oraz największy element tablicy (wypisz je)
//        d. wypisz średnią arytmetyczną tablicy (*spróbuj zrobić to samo z tablicą liczb
//        zmiennoprzecinkowych)
//        e. wypisz ilość elementów większych/mniejszych od średniej
//        f. wypisz tablicę w odwrotnej kolejności
//        g. **wyznacz medianę - > posortuj tablicę używając Arrays.sort() a następnie
//        określ medianę
//        Przykład:
//        Wylosowane liczby:
//        -3 9 2 -10 -3 -4 -1 -5 -10 8
//        Min: -10, max: 9
//        Średnia: -1,00
//        Mniejszych od śr.: 6
//        Większych od śr.: 3
//        Liczby w odwrotnej kolejności:
//        8 -10 -5 -1 -4 -3 -10 2 9 -3
public class Zadanie1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[10];
        for ( int i = 0; i < tablica.length; i++ ) {
            tablica[i] = random.nextInt(21) - 10;
        }
        System.out.println("Wypisanie tabeli ");
        for ( int i = 0; i < tablica.length; i++ ) {
            System.out.println(tablica[i]);
        }
        int max = tablica[0], min = tablica[0];
        double srednia = 0;

        //okrslenie liczby maksymalnej
        for ( int i = 0; i < tablica.length; i++ ) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        System.out.println("Największy element tablicy: " + max);
        //okrslenie liczby minimalnej
        for ( int i = 0; i < tablica.length; i++ ) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        System.out.println("Najmniejszy element tablicy: " + min);
        //określenie średniej
        for ( int i = 0; i < tablica.length; i++ ) {
            srednia += tablica[i];
        }
        srednia /= tablica.length;
        System.out.println("srednia wynosi: " + srednia);

        System.out.println("Elementy większe od śreniej:");
        //wypisanie elementó wiekszych od średniej
        for ( int i = 0; i < tablica.length; i++ ) {
            if (tablica[i] > srednia) {
                System.out.println(tablica[i]);
            }
        }

        System.out.println("Elementy mniejsze od śreniej:");
        //wypisanie elementó mniejszychh od średniej
        for ( int i = 0; i < tablica.length; i++ ) {
            if (tablica[i] < srednia) {
                System.out.println(tablica[i]);
            }
        }

        System.out.println("Odwrotna kolejność");
        for ( int i = tablica.length - 1; i >= 0; i-- ) {
            System.out.println(tablica[i]);
        }

        System.out.println("Posortowana tabela");
        Arrays.sort(tablica);
        double mediana;
        if (tablica.length % 2 == 0)
            mediana = ((double)tablica[tablica.length/2] + (double)tablica[tablica.length/2 - 1])/2;
        else
            mediana = (double) tablica[tablica.length/2];
        System.out.println("mediana: " + mediana);




    }
}
