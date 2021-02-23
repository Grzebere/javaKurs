package pl.sda.domowe.jeden;

/*13. Napisz aplikację która pobiera od użytkownika (liczbę) N a nastepnie:
        a. losuje N liczb całkowitych (dowolny zakres) i wypisuje je na ekran
        b. losuje N liczb zmiennoprzecinkowych i wypisuje je na ekran
        c. losuje N razy wartość boolean i wypisuje je na ekran
        d. pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje N
        liczb całkowitych z tego zakresu, a następnie wypisuje je na ekran
        e. pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje N
        liczb zmiennoprzecinkowych z tego zakresu, a następnie wypisuje je na ekran
        Rozwiąż to zadanie wykorzystując mechanizm losowania liczb z klasy Random oraz z
        klasy Math (metoda random()).*/

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Trzynascie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int poczatekZakresu, koniecZakresu, liczbaBezZakresuPoczatkowego, liczbaOkreslona;
        double liczbaBezZakresuPoczatkowegoZmiennoprzecinkowa, liczbaOkreslonaZmiennoprzecinkowa;
        LinkedList list = new LinkedList();
        Random generator = new Random();
        System.out.println("a.");

        for ( int i = 0; i < n; i++ ) {
            System.out.println(generator.nextInt());
        }

        System.out.println("b. ");
        for ( int i = 0; i < n; i++ ) {
            System.out.println(generator.nextDouble());
        }

        System.out.println("c. ");
        for ( int i = 0; i < n; i++ ) {
            System.out.println(generator.nextBoolean());
        }

        System.out.println("d. ");
        scanner.nextLine();
        System.out.println("Podaj początek zakresu");
        poczatekZakresu = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj koniec zakresu");
        koniecZakresu = scanner.nextInt();
        for ( int i = 0; i < n; i++ ) {
            liczbaBezZakresuPoczatkowego = generator.nextInt(koniecZakresu - poczatekZakresu);
            liczbaOkreslona = liczbaBezZakresuPoczatkowego + poczatekZakresu;
            System.out.println(liczbaOkreslona);

        }
        System.out.println("e. ");
        scanner.nextLine();
        System.out.println("Podaj początek zakresu");
        poczatekZakresu = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj koniec zakresu");
        koniecZakresu = scanner.nextInt();
        for ( int i = 0; i < n; i++ ) {
            liczbaBezZakresuPoczatkowegoZmiennoprzecinkowa = generator.nextDouble() * (koniecZakresu - poczatekZakresu);
            liczbaOkreslonaZmiennoprzecinkowa = liczbaBezZakresuPoczatkowegoZmiennoprzecinkowa + poczatekZakresu;
            System.out.println(liczbaOkreslonaZmiennoprzecinkowa);

        }

    }
}
