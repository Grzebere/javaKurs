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

public class Zadanie1While {
    public static void main(String[] args) {
        //a. liczby z zakresu 1 - 100 w nowych liniach
        System.out.println();
        System.out.println("a. ");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        //b. liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
        System.out.println();
        System.out.println("b. ");
        i = 1000;
        while (i < 1020) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println(1020);

        //c. liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
        System.out.println();
        System.out.println("c. ");
        i = -30;
        while (i <= 1000) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }

        //d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
        System.out.println();
        System.out.println("d. ");
        i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

        //e. liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach
        System.out.println();
        System.out.println("e. ");
        i = 30;
        while (i <= 300) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
            i++;
        }

        //f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
        System.out.println();
        System.out.println("f. ");
        i = -300;
        while (i < 299) {
            if (i % 2 == 1) {
                System.out.print(i + ";");
            }
            i++;
        }
        System.out.println(299);

        //g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
        System.out.println();
        System.out.println("g. ");
        i = -100;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.print(i + ";");
            }
            i++;
        }
        System.out.println(100);

        //h. litery od 'a' do 'z'
        System.out.println();
        System.out.println("h. ");
        i = 97;
        while (i <= 122) {
            System.out.println((char) i);
            i++;
        }

        //i. litery od ‘A’ do ‘Z’
        System.out.println();
        System.out.println("i. ");
        i = 65;
        while (i <= 90) {
            System.out.println((char) i);
            i++;
        }


        //j. litery od ‘A’ do ‘Z’, tylko co drugą
        System.out.println();
        System.out.println("j. ");
        i = 65;
        while (i <= 90) {
            System.out.println((char) i);
            i += 2;
        }

        //k. litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest
        //        podzielny przez 5
        System.out.println();
        System.out.println("k. ");
        i = 98;
        while (i <= 122) {
            if (i % 5 == 0) {
                System.out.println((char) i);
            }
            i += 2;
        }

        // l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer
        //        wypisania) np.
        //        1. Hello World
        //        2. Hello World
        //        3. Hello World
        //        4. ….
        System.out.println();
        System.out.println("l. ");
        i = 1;
        while (i <= 100) {
            System.out.println(i + ". Hello World");
            i++;
        }

    }
}
