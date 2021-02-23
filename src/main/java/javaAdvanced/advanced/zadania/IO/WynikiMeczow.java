package javaAdvanced.advanced.zadania.IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WynikiMeczow {
    public static void main(String[] args) throws FileNotFoundException {
        start();

    }

    public static void start() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter("wyniki.txt");
        String druzyna1, druzyna2;
        int wynik1, wynik2, karne1, karne2;
        while (true) {
            System.out.println("Wpisza nazwę pierwszej drużyny");
            druzyna1 = scanner.nextLine();
            System.out.println("Wpisza nazwę drugiej drużyny");
            druzyna2 = scanner.nextLine();
            System.out.println("Wpisza liczbę bramek pierwszej drużyny");
            wynik1 = scanner.nextInt();
            System.out.println("Wpisza liczbę bramek drugiej drużyny");
            wynik2 = scanner.nextInt();
            if (wynik1 == wynik2) {
                System.out.println("Wpisza liczbę karnych pierwszej drużyny");
                karne1 = scanner.nextInt();
                System.out.println("Wpisza liczbę karnych drugiej drużyny");
                karne2 = scanner.nextInt();
                if (karne1 > karne2) {
                    printWriter.println(druzyna1 + "<" + wynik1 + ">(" + karne1 + ") : (" + karne2 + ")<" + wynik2 + ">" + druzyna2);
                } else if (karne2 > karne1) {
                    printWriter.println(druzyna2 + "<" + wynik2 + ">(" + karne2 + ") : (" + karne1 + ")<" + wynik1 + ">" + druzyna1);
                }
            } else if (wynik1 > wynik2) {
                printWriter.println(druzyna1 + "<" + wynik1 + "> : <" + wynik2 + ">" + druzyna2);
            } else if (wynik1 < wynik2) {
                printWriter.println(druzyna2 + "<" + wynik2 + "> : <" + wynik1 + ">" + druzyna1);
            }
            scanner.nextLine();
            System.out.println("Czy zapisać kolejny wynik (y/n)");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
        printWriter.close();
    }
}
