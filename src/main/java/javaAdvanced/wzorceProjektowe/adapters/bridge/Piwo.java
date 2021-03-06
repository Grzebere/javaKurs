package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.List;

public class Piwo implements Drink {
    List<Dodatki> dodatki;

    public Piwo(List<Dodatki> dodatki) {
        this.dodatki = dodatki;
    }

    @Override
    public String nazwa() {
        return "Piwo";
    }

    @Override
    public int pojemnosc() {
        return 500;
    }

    @Override
    public double cena() {
        return 5.0 + cenaDodatków();
    }

    @Override
    public boolean czyJestAlkohol() {
        return true;
    }

    private double cenaDodatków() {
        return 0.5 * dodatki.size();
    }
}