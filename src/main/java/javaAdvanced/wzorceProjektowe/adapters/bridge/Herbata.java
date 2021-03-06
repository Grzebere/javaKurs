package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.List;

public class Herbata implements Drink{
    private List<Dodatki> dodatki;
    public Herbata(List<Dodatki> dodatki) {
        this.dodatki = dodatki;
    }
    @Override
    public String nazwa() {
        return "Herbata";
    }
    @Override
    public int pojemnosc() {
        return 250;
    }
    @Override
    public double cena() {
        return 6.5 + cenaDodatków();
    }
    @Override
    public boolean czyJestAlkohol() {
        return false;
    }
    private double cenaDodatków(){
        return  0.5*dodatki.size();
    }
}
