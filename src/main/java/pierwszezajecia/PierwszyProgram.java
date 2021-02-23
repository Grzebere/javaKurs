package pierwszezajecia;

public class PierwszyProgram {

    public static void main(String args[]) {
        String imie = "Grzegorz";           //deklaracje + inicjalizacja
        String hello = "Heello World!";
        String mam = "Mam na imię";

        //można napisać "sout" aby otrzymać :
        //System.out.println();

        System.out.println(hello);
        System.out.println(mam);
        System.out.println(imie);

        String all = hello + "\n" + mam + "\n" + imie;
        System.out.println(all);


    }
}
