package pl.sda.domowe.jeden;

/*
11. Napisać program obliczający należny podatek dochodowy od osób zycznych. W
        programie zdefiniuj wartość dochód (double) na pewną wartość i po obliczeniu
        wypisywać na ekranie należny podatek. Podatek obliczany jest wg. następujących
        reguł:
        a. do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
        b. od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
*/

import java.util.Scanner;

public class Jedenascie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dochod = scanner.nextDouble();
        double podatek;
        if (dochod < 85528d) {
            podatek = (dochod * 0.18) - 556.02d;
            System.out.println("Podatek: " + podatek);
        } else if (dochod >= 85528) {
            podatek = 14839.02 + ((dochod - 85528) * 0.32);
            System.out.println("Podatek: " + podatek);
        }


    }
}
