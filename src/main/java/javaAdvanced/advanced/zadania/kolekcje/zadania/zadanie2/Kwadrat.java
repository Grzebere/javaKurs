package javaAdvanced.advanced.zadania.kolekcje.zadania.zadanie2;

import java.util.Objects;

public class Kwadrat extends Figura {
    protected double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double obliczPole() {
        return a * a;
    }

    @Override
    public int compareTo(Figura o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return Double.compare(kwadrat.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
