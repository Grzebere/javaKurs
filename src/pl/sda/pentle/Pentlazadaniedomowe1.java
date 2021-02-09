package pl.sda.pentle;

import java.util.Scanner;

public class Pentlazadaniedomowe1 {

    //Zadanie domowe:
    //Stworz program ktora pobiera od uzytkownika dwie liczby (a,b), a nastepnie wypisuje wszystkie liczby parzyste z przedzialu od a do b (bez a i bez b)
    //Stworz program ktora pobiera od uzytkownika dwie liczby (a,b), a nastepnie wypisuje wszystkie liczby nieparzyste z przedzialu od a do b (bez a i bez b)
    //3. Korzystajac z poprzednich zadan spraw, aby uzytkownik sam wybieral, czy chce zobaczyc liczby parzyste czy nieparzyste z przedzialu ktory podal.
    //*spraw aby uzytkownik mogl podawac a i b w dowolnej kolejnosci, czyli: a moze byc wieksze od b lub b moze byc wieksze od a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = scanner.nextInt();
        System.out.println("podaj liczbę b");
        int b = scanner.nextInt();
        if (a < b) {
            for ( int i = a + 1; i < b; i++ ) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for ( int i = b + 1; i < a; i++ ) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
