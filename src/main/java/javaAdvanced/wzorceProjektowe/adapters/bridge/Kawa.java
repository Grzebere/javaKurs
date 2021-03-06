package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.List;

public class Kawa implements Drink{
    List<Dodatki> dodatki;
    public Kawa(List<Dodatki> dodatki) {
        this.dodatki = dodatki;
    }
    @Override
    public String nazwa() {
        return "Kawa";
    }
    @Override
    public int pojemnosc() {
        return 500;
    }
    @Override
    public double cena() {
        return 12.50 + cenaDodatków();
    }
    @Override
    public boolean czyJestAlkohol() {
        return false;
    }
    private double cenaDodatków(){
        return  0.5*dodatki.size();
    }
}