package javaAdvanced.advanced.zadania.polimorfizm.zadanie1;

public class Trapez extends Figura{
    private double bokA, bokB, wysokosc;

    public Trapez(double bokA, double bokB, double wysokosc) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.wysokosc = wysokosc;
    }


    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    @Override
    public double obliczPole() {
        return (bokA+bokB)*wysokosc/2;
    }
}
