package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.List;

public class Szampan implements Drink {

    List<Dodatki> dodatki;

    public Szampan(List<Dodatki> dodatki) {
        this.dodatki = dodatki;
    }

    @Override
    public String nazwa() {
        return "Shampan";
    }

    @Override
    public int pojemnosc() {
        return 1000;
    }

    @Override
    public double cena() {
        return 30 + cenaDodatków();
    }

    @Override
    public boolean czyJestAlkohol() {
        return true;
    }

    private double cenaDodatków() {
        return 0.5 * dodatki.size();
    }
}
