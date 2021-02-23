package pl.sda.domowe.pentle;

import java.util.Scanner;

/*6. Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
        następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
        liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
        1 2 4 8 16 32 64*/
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dodatnią liczbę n");
        int n = scanner.nextInt();
        if (n >= 0) {
            System.out.println("Wszystkie potęgi liczby 2 nie większe, niż podana liczba: ");
            for ( int i = 1; i < n; i *= 2 ) {
                System.out.println(i);
            }
        } else {
            System.out.println("Liczba nie jest liczbą dodatnią");
        }
    }
}
