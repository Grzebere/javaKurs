package javaAdvanced.advanced.zadania.polimorfizm.zadanie1;

public class SymulatorFarby {

    public static int obliczZapotrzbowanieNaFarbe(Figura[] figury, double wilkoscPojemnika) {
        double powierzchnia = 0;


        for ( Figura figura : figury ) {
            powierzchnia += figura.obliczPole();
        }
        if (powierzchnia % wilkoscPojemnika == 0) {
            return (int) (powierzchnia / wilkoscPojemnika);
        } else {
            return (int) (powierzchnia / wilkoscPojemnika) + 1;
        }
    }
}
