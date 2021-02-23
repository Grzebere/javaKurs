package pl.sda.typyDanych;

public class KonwersjaTypow {
    public static void main(String[] args) {
        short liczba = 3;
        int intA = liczba;
        long longB = liczba;
        float floatC = intA;
        double doubleD = intA;
        int intE = (int) longB;
        byte byteF = (byte) liczba;

        char charG = 'g';
        int intG = charG;

        /*System.out.println("a) : " + intA);
        System.out.println("b) : " + longB);
        System.out.println("c) : " + floatC);
        System.out.println("d) : " + doubleD);
        System.out.println("e) : " + intE);
        System.out.println("f) : " + byteF);
        System.out.println("g) : " + intG);*/
    }
}
