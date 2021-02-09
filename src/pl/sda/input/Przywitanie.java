package pl.sda.input;

import java.util.Scanner;

public class Przywitanie {
    public static void main(String[] args) {
        System.out.println("Podaj mi swoje imię!");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        System.out.println("Witaj: " + imie + "!");
    }
}
