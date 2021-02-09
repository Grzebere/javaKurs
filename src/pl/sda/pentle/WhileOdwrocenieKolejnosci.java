package pl.sda.pentle;
/*
Za pomoca petli while odwrocic podana liczbe, np. dla podanej liczby 12345, wynikowa liczba ma wynosci 54321
*/

import java.util.Scanner;

public class WhileOdwrocenieKolejnosci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbę");
        int n = scanner.nextInt();
        int i = 1;
        int reszta = 0;
        int ostatnia = 0;

        while (i < n) {
            i *= 10;
            reszta = n % i / (i / 10);
            ostatnia = reszta;
            System.out.print(reszta);

        }

    }
}
