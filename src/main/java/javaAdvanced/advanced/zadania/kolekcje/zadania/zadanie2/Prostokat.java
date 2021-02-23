package javaAdvanced.advanced.zadania.kolekcje.zadania.zadanie2;

import java.util.Objects;

public class Prostokat extends Figura {
    protected double a;
    protected double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double obliczPole() {
        return a * b;
    }

    @Override
    public int compareTo(Figura o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prostokat prostokat = (Prostokat) o;
        return Double.compare(prostokat.a, a) == 0 &&
                Double.compare(prostokat.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
