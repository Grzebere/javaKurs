package pl.sda.domowe.pentle;

/*
Napisz aplikację która wypisuje:
        a. liczby z zakresu 1 - 100 w nowych liniach
        b. liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
        c. liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
        d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
        e. liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach
        f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
        g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
        h. litery od 'a' do 'z'
        i. litery od ‘A’ do ‘Z’
        j. litery od ‘A’ do ‘Z’, tylko co drugą
        k. litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest
        podzielny przez 5
        l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer
        wypisania) np.
        1. Hello World
        2. Hello World
        3. Hello World
        4. ….
*/

public class Zadanie1For {
    public static void main(String[] args) {
        //a. liczby z zakresu 1 - 100 w nowych liniach
        System.out.println();
        System.out.println("a. ");
        for ( int i = 1; i <= 100; i++ ) {
            System.out.println(i);
        }

        //b. liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
        System.out.println();
        System.out.println("b. ");
        for ( int i = 1000; i < 1020; i++ ) {
            System.out.print(i + ", ");
        }
        System.out.println(1020);

        //c. liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
        System.out.println();
        System.out.println("c. ");
        for ( int i = -30; i <= 1000; i++ ) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        //d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
        System.out.println();
        System.out.println("d. ");
        for ( int i = 1; i <= 100; i++ ) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        //e. liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach
        System.out.println();
        System.out.println("e. ");
        for ( int i = 30; i <= 300; i++ ) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
        }

        //f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
        System.out.println();
        System.out.println("f. ");
        for ( int i = -300; i < 299; i++ ) {
            if (i % 2 == 1) {
                System.out.print(i + ";");
            }
        }
        System.out.println(299);

        //g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
        System.out.println();
        System.out.println("g. ");
        for ( int i = -100; i < 100; i++ ) {
            if (i % 2 == 0) {
                System.out.print(i + ";");
            }
        }
        System.out.println(100);

        //h. litery od 'a' do 'z'
        System.out.println();
        System.out.println("h. ");
        for ( int i = 97; i <= 122; i++ ) {
            System.out.println((char) i);
        }

        //i. litery od ‘A’ do ‘Z’
        System.out.println();
        System.out.println("i. ");
        for ( int i = 65; i <= 90; i++ ) {
            System.out.println((char) i);
        }

        //j. litery od ‘A’ do ‘Z’, tylko co drugą
        System.out.println();
        System.out.println("j. ");
        for ( int i = 65; i <= 90; i += 2 ) {
            System.out.println((char) i);
        }

        //k. litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest
        //        podzielny przez 5
        System.out.println();
        System.out.println("k. ");
        for ( int i = 98; i <= 122; i += 2 ) {
            if (i % 5 == 0) {
                System.out.println((char) i);
            }
        }

        // l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer
        //        wypisania) np.
        //        1. Hello World
        //        2. Hello World
        //        3. Hello World
        //        4. ….
        System.out.println();
        System.out.println("l. ");
        for ( int i = 1; i <= 100; i++ ) {
            System.out.println(i + ". Hello World");
        }

    }
}
