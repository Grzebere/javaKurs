package javaAdvanced.advanced.zadania.intercaces.zadania.zajeciowe.zadanie3;

public class Main {
    public static void main(String[] args) {
        Jedzacy[] jedzacy = new Jedzacy[3];
        jedzacy[0]= new Programista();
        jedzacy[1]= new Krokodyl();
        jedzacy[2]= new Weganin();
        for( Jedzacy istota : jedzacy){
            istota.jedz(new Pokarm("Kotlet", TypPokarmu.MIESO, 400));
            istota.jedz(new Pokarm("Jabłka", TypPokarmu.OWOCE, 400));
            istota.jedz(new Pokarm("Ser", TypPokarmu.NABIAL, 100));
            istota.jedz(new Pokarm("Pulpety", TypPokarmu.MIESO, 1000));
            System.out.println(istota.ileGramowZjedzone());
            System.out.println(istota.ilePosilkowZjedzone());
        }
        ktoZjadlNajwiecejIlosc(jedzacy);
        ktoZjadlNajwiecejWaga(jedzacy);


    }

    public static void ktoZjadlNajwiecejIlosc(Jedzacy... jedzacy){
        int najwiecejPosilkow = jedzacy[0].ilePosilkowZjedzone();
        Jedzacy zwyciesca = jedzacy[0];
        for (Jedzacy istota: jedzacy){
            if (najwiecejPosilkow < istota.ilePosilkowZjedzone()){
                najwiecejPosilkow = istota.ilePosilkowZjedzone();
                zwyciesca= istota;
            }
        }
        System.out.println("Najwięcej zjadł " + zwyciesca.getClass().getSimpleName());
    }

    public static void ktoZjadlNajwiecejWaga(Jedzacy... jedzacy){
        int najwiekszaWaga = jedzacy[0].ileGramowZjedzone();
        Jedzacy zwyciesca = jedzacy[0];
        for (Jedzacy istota: jedzacy){
            if (najwiekszaWaga < istota.ileGramowZjedzone()){
                najwiekszaWaga = istota.ileGramowZjedzone();
                zwyciesca = istota;
            }
        }
        System.out.println("Najwięcej zjadł " + zwyciesca.getClass().getSimpleName());
    }
}
