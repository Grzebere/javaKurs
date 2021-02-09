package pl.sda.obiekty.gra.zgadnijHaslo;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanie {
    Random random = new Random();
    int zakres;
    private int i = 0;
    private int liczba = random.nextInt(zakres);
    int strzal;

    public Zgadywanie (int zakres){
        this.zakres = zakres;
    }
    public void zagraj(){
        System.out.println("Zagadnil wylosowaną liczbę z zakeresu (0-100)");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Podaj liczbę:");
            strzal = scanner.nextInt();
            if (strzal == this.liczba) {
                System.out.println("Gratulacje");
                break;
            }
            else if (strzal > this.liczba) {
                System.out.println("Podałeś za dużą wartość");
                i++;
            }
            else if (strzal < this.liczba) {
                System.out.println("Podałeś za małą wartość");
                i++;
            }

        }
    }


}
