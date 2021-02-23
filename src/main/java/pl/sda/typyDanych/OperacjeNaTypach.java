package pl.sda.typyDanych;

public class OperacjeNaTypach {
    public static void main(String[] args) {
        System.out.println("a) " + (2 + 3));        //int
        System.out.println("b) " + (2 - 4));        //int
        System.out.println("c) " + (5 / 2));        //int
        System.out.println("d) " + (5.0 / 2));      //double
        System.out.println("e) " + (5 / 2.0));      //double
        System.out.println("f) " + (5.0 / 2.0));    //double
        System.out.println("g) " + (100L - 10));    //long
        System.out.println("h) " + (2f - 3));       //float
        System.out.println("i) " + (5f / 2));       //float
        System.out.println("j) " + (5d / 2));       //double
        System.out.println("k) " + ('A' + 2));      //int
        System.out.println("l) " + ('a' + 2));      //int
        System.out.println("m) " + ("a" + 2));      //string
        System.out.println("n) " + ("a" + "b"));    //string
        System.out.println("o) " + ('a' + 'b'));    //int?
        System.out.println("p) " + ("a" + 'b'));    //string
        System.out.println("q) " + ("a" + 'b' + 3));//string
        System.out.println("r) " + ('b' + 3 + "a"));//string
        System.out.println("s) " + (9 - ((9 / 4) * 4)));//int


    }
}
