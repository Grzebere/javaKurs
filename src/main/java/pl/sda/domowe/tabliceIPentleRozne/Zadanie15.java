package pl.sda.domowe.tabliceIPentleRozne;

import java.util.Scanner;

/*15. Napisz program, który dla zadanych dwóch liczb zwraca największy wspólny dzielnik np.
        a. 12 i 48 -> 12
        b. 5 i 1 -> 1
        c. 35 i 10 -> 5*/
public class Zadanie15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaA = scanner.nextInt();
        int liczbaB = scanner.nextInt();
        int dzielnik = 1;
        if (liczbaA >= liczbaB) {
            for ( int i = liczbaB; i > 0; i-- ) {
                if (liczbaA % i == 0 && liczbaB % i == 0) {
                    dzielnik = i;
                    break;
                }
            }
        } else {
            for ( int i = liczbaA; i > 0; i-- ) {
                if (liczbaA % i == 0 && liczbaB % i == 0) {
                    dzielnik = i;
                    break;
                }
            }
        }
        System.out.println("Najwiekszy wspólny dzielnik liczb: " + liczbaA + " i " + liczbaB + " -> " + dzielnik);


    }
}
