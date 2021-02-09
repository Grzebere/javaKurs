package pl.sda.varargs;

public class Kalkulator {
    public static int dodaj(int... numery) {
        int suma = 0;
        for ( int numer : numery
        ) {
            suma += numer;
        }
        return suma;
    }

    public static int odejmij(int... numery) {
        int roznica = 0;
        for ( int numer : numery
        ) {
            roznica -= numer;
        }
        return roznica;
    }


}
