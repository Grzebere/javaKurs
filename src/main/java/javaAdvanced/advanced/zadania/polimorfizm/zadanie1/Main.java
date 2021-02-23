package javaAdvanced.advanced.zadania.polimorfizm.zadanie1;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = new Figura[3];
        figury[0] = new Kwadrat(2);
        figury[1] = new Trapez(2,3,4);
        figury[2] = new Kolo(1);
        System.out.println(SymulatorFarby.obliczZapotrzbowanieNaFarbe(figury, 3));
    }
}
