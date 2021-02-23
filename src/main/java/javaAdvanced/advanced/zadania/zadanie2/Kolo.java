package javaAdvanced.advanced.zadania.zadanie2;

public class Kolo {
    protected double radius;
    protected final double PI = 3.14;


    public Kolo( double radius) {
        this.radius = radius;
    }

    protected final double obliczPole(){
        return PI * Math.sqrt(this.radius);
    }

    protected final double obliczPole( double r){
        return PI * Math.sqrt(r);
    }


}
