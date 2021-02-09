package pl.sda.domowe.pentle;

/*Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby
        większe od 0.*/

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int liczba = scanner.nextInt();
        while (liczba > 0) {
            System.out.println("Hello World");
            liczba = scanner.nextInt();
        }
    }
}

