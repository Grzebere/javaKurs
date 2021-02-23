package pl.sda.domowe.tabliceIPentleRozne;

public class Zadanie13 {
    public static void main(String[] args) {
        System.out.println("a. ");
        for ( int i = 0; i < 8; i++ ) {
            for ( int j = 0; j < i + 1; j++ ) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("b. ");
        for ( int i = 8; i > 0; i-- ) {
            for ( int j = 0; j < i; j++ ) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("c. ");
        for ( int i = 8; i > 0; i-- ) {
            for ( int j = 8 - i; j > 0; j-- ) {
                System.out.print("  ");
            }
            for ( int j = 0; j < i; j++ ) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("d. ");
        for ( int i = 0; i < 8; i++ ) {
            for ( int j = 8 - i; j > 0; j-- ) {
                System.out.print("  ");
            }
            for ( int j = 0; j < i + 1; j++ ) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
