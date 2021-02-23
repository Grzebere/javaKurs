package pl.sda.domowe.pentle;

import java.util.Scanner;

/*7. Napisać program, który pobiera od użytkownika ilość liczb N , a następnie wczytuje:
        - N liczb całkowitych od użytkownika
        - W następnej kolejności program powinien wyświetlić sumę największej oraz
        najmniejszej z podanych liczb oraz ich średnią arytmetyczną.*/
public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ilość liczb N");
        int iloscN = scanner.nextInt();
        int[] liczbyN = new int[iloscN];
        for ( int i = 0; i < liczbyN.length; i++ ) {
            System.out.println("Podaj liczbę:");
            liczbyN[i] = scanner.nextInt();
        }
        int max = liczbyN[0], min = liczbyN[0];
        double srednia = 0;
        //okrslenie liczby maksymalnej
        for ( int i = 0; i < liczbyN.length; i++ ) {
            if (liczbyN[i] > max) {
                max = liczbyN[i];
            }
        }
        //okrslenie liczby minimalnej
        for ( int i = 0; i < liczbyN.length; i++ ) {
            if (liczbyN[i] < min) {
                min = liczbyN[i];
            }
        }
        //określenie średniej
        for ( int i = 0; i < liczbyN.length; i++ ) {
            srednia += liczbyN[i];
        }
        srednia /= liczbyN.length;
        //wyświtlenie
        System.out.println("Suma największej oraz najmniejszej z podanych liczb: " + (min + max));
        System.out.println("Srednia arytmetyczna liczb: " + srednia);

    }
}
