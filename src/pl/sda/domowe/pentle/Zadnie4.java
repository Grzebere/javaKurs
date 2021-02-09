package pl.sda.domowe.pentle;

/*4. Napisać program w którym użytkownik podaje na początku dwie liczby:
        początekZakresu oraz koniecZakresu. Upewnij się że początekZakresu <
        koniecZakresu a następnie
        a. pobierz od użytkownika kolejną liczbę - dzielnik. Po pobraniu dzielnika
        wypisz wszystkie liczby od początekZakresu do koniecZakresu które są
        podzielne przez dzielnik .
        b. *pobierz od użytkownika iloscDzielnikow, a następnie wczytaj wszystkie
        dzielniki. Po wczytaniu wszystkich dzielnikow wypisz wszystkie liczby od
        poczatekZakresu do koniecZakresu które są podzielne przez wszystkie
        dzielniki.*/

import java.util.Scanner;

public class Zadnie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean czyPodzilnaPrzezWszytko;
        System.out.println("Wpisz początek zakrsu");
        int poczatekZakresu = scanner.nextInt();
        System.out.println("Wpisz koniec zakrsu");
        int koniecZakresu = scanner.nextInt();
        /*if (poczatekZakresu < koniecZakresu) {
            System.out.println("a. wpisz dzielnik");
            int dzielnik = scanner.nextInt();
            System.out.println("Liczy z zakresu podzielne przez dzielnik");
            for ( int i = poczatekZakresu; i <= koniecZakresu; i++ ) {
                if (i % dzielnik == 0) {
                    System.out.println(i);
                }
            }
        }*/
        if (poczatekZakresu < koniecZakresu) {
            System.out.println("b. wpisz liczbę dzielników dzielnik");
            int liczbaDzielnikow = scanner.nextInt();
            int[] dzielniki = new int[liczbaDzielnikow];
            for ( int i = 0; i < liczbaDzielnikow; i++ ) {
                System.out.println("wpisz dzielnik");
                int dzielnik = scanner.nextInt();
                dzielniki[i] = dzielnik;

            }
            System.out.println("Liczy z zakresu podzielne przez dzielniki");
            for ( int i = poczatekZakresu; i <= koniecZakresu; i++ ) {
                czyPodzilnaPrzezWszytko = true;
                for ( int j = 0; j < dzielniki.length; j++ ) {
                    if (i % dzielniki[j] != 0) {
                        czyPodzilnaPrzezWszytko = false;
                        break;
                    }
                }
                if (czyPodzilnaPrzezWszytko == true) {
                    System.out.println(i);
                }
            }
        }
    }
}
