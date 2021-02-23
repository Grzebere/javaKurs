package pl.sda.regex.cwiczenia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WyrazeniaRegularne.zlacz(pobierzZadanieOdUżytkownika(), pobierzZadanieOdUżytkownika());

    }

    private static String pobierzZadanieOdUżytkownika() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
