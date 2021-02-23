package pl.sda.tablice;

public class TablicaZad1 {
    public static void main(String[] args) {
        int[] liczby = new int[]{1, 3, 5, 10};
        System.out.println("2. ");
        System.out.println(liczby[1]);
        System.out.println(liczby[2]);
        System.out.println("3. ");
        for ( int i = 0; i < liczby.length; i++ ) {
            System.out.println(liczby[i]);
        }
        System.out.println("4. ");
        for ( int i = 0; i < liczby.length; i += 2 ) {
            System.out.println(liczby[i]);
        }
        System.out.println("5. ");
        for ( int i = 0; i < liczby.length; i++ ) {
            if (liczby[i] % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }
        System.out.println("6. ");
        for ( int i = liczby.length - 1; i >= 0; i-- ) {
            System.out.println(liczby[i]);
        }

    }
}
