package pl.sda.domowe.tabliceIPentleRozne;

import java.util.Scanner;

/*
Jan Kowalski musi wpisać do systemu szpitalnego dane osobowe pacjenta, oprócz imienia i nazwiska musi również wpisać PESEL pacjenta. Jakież było jego zdziwienie, gdy spostrzegł, że pewnych pacjentów system nie przyjmował z powodu wadliwego PESELu.

        Twoim zadaniem jest sprawdzenie, czy podana liczba 11-cyfrowa jest poprawnym PESELem.

        Aby sprawdzić czy dany PESEL jest prawidłowy należy wykonać następujące działania:

        Pierwszą cyfrę mnożymy przez 1,
        drugą cyfrę mnożymy przez 3,
        trzecią cyfrę mnożymy przez 7,
        czwarta cyfrę mnożymy przez 9,
        piątą cyfrę mnożymy przez 1,
        szóstą cyfrę mnożymy przez 3,
        siódmą cyfrę mnożymy przez 7,
        ósmą cyfrę mnożymy przez 9,
        dziewiątą cyfrę mnożymy przez 1,
        dziesiątą cyfrę mnożymy przez 3,
        jedenastą cyfrę mnożymy przez 1.

        Tak uzyskane 11 iloczynów dodajemy do siebie. Jeśli ostatnia cyfra tej sumy jest zerem to podany PESEL jest prawidłowy. Przykład dla numeru PESEL 44051401458

        4*1 + 4*3 + 0*7 + 5*9 + 1*1 + 4*3 + 0*7 + 1*9 + 4*1 + 5*3 + 8*1 = 4 + 12 + 0 + 45 + 1 + 12 + 0 + 9 + 4 + 15 + 8 = 110

        Źródło: www.wikipedia.pl

        Jeśli suma jest większa od zera, wtedy sprawdzamy jej poprawność. W przeciwnym przypadku nr PESEL jest błędny. Ponieważ ostatnia cyfra liczby 110 jest zerem więc podany PESEL jest prawidłowy.

        Na wejściu podana jest w pojedyńczej linii ilość t<=100 numerów PESEL do sprawdzenia. W kolejnych t liniach są 11-cyfrowe liczby.

        Output
        W pojedyńczej linii powinna zostać wyświetlona litera D, jeśli numer PESEL jest poprawny lub N, gdy nie.
*/
public class Zadanie17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę numerów PESEL");
        int t = scanner.nextInt();
        long[] pesel = new long[t];
        for ( int i = 0; i < t; i++ ) {
            System.out.println("wpisz numer PESEL");
            pesel[i] = scanner.nextLong();
        }
        for ( int i = 0; i < pesel.length; i++ ) {
            long cyfra1 = pesel[i] / 10000000000l;
            long cyfra2 = (pesel[i] / 1000000000l) % 10;
            long cyfra3 = (pesel[i] / 100000000l) % 10;
            long cyfra4 = (pesel[i] / 10000000) % 10;
            long cyfra5 = (pesel[i] / 1000000) % 10;
            long cyfra6 = (pesel[i] / 100000) % 10;
            long cyfra7 = (pesel[i] / 10000) % 10;
            long cyfra8 = (pesel[i] / 1000) % 10;
            long cyfra9 = (pesel[i] / 100) % 10;
            long cyfra10 = (pesel[i] / 10) % 10;
            long cyfra11 = pesel[i] % 10;

            int suma = (int) ((cyfra1 * 1) + (cyfra2 * 3) + (cyfra3 * 7) + (cyfra4 * 9) + (cyfra5 * 1) + (cyfra6 * 3) + (cyfra7 * 7) + (cyfra8 * 9) + (cyfra9 * 1) + (cyfra10 * 3) + (cyfra11 * 1));

            //System.out.println(suma);
            if (suma % 10 == 0 && suma > 0) {
                System.out.println("D");
            } else {
                System.out.println("N");
            }
        }

    }
}