package pl.sda.pentle;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class DoWhileZad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Wpisz liczbę: ");
            n = scanner.nextInt();
            double pier = sqrt(n);
            System.out.println(pier);
        } while (n > 0);
    }
}
