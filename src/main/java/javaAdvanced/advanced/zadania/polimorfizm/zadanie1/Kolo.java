package javaAdvanced.advanced.zadania.polimorfizm.zadanie1;

public class Kolo extends Figura {
    private double promien;

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPole() {
        return 3.14 * promien * promien;
    }
}
