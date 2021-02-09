package pl.sda.domowe.jeden;

/*15. Napisz aplikację która wypisuje alfabet. Podpowiedź: w pętli użyj typu char dla
        iteratora.*/
public class Pietnascie {
    public static void main(String[] args) {
        char litera;
        for ( int i = 65; i < 91; i++ ) {
            litera = (char) i;
            System.out.println(litera);
        }
    }
}
