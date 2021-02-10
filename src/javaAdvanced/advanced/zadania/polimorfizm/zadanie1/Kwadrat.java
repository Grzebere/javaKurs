package javaAdvanced.advanced.zadania.polimorfizm.zadanie1;

public class Kwadrat extends Trapez {
    private double bokA;

    public Kwadrat(double bokA) {
        super(bokA, bokA, bokA);
        this.bokA = bokA;
    }


    @Override
    public double obliczPole() {
        return bokA*bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }
}
