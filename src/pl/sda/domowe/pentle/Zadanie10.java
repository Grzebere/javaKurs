package pl.sda.domowe.pentle;
/*10. Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
        Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
        wysokość choinki (liczbę wierszy). Przykład: dla n = 5 wynik powinien wyglądać
        następująco:
            *
           ***
          *****
         *******
        *********   */

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        for ( int i = 0; i < liczba; i++ ) {
            for ( int j = liczba - i; j > 0; j-- ) {
                System.out.print(" ");
            }

            for ( int j = 0; j < (2*i) + 1; j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
