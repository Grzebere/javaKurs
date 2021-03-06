package javaAdvanced.wzorceProjektowe.fabryka.zadanie.restauracje;

import java.util.List;

public class Burger {

    private List<Skladniki> skladniki;
    private double cena;
    private Waga waga;
    private Burger(List<Skladniki> skladniki, double cena, Waga waga) {
        this.skladniki = skladniki;
        this.cena = cena;
        this.waga = waga;
    }
    public List<Skladniki> getSkladniki() {
        return skladniki;
    }
    public double getCena() {
        return cena;
    }
    public Waga getWaga() {
        return waga;
    }
    @Override
    public String toString() {
        return "Burger{" +
                "skladniki=" + skladniki +
                ", cena=" + cena +
                ", waga=" + waga +
                '}';
    }
    public static class Builder{
        private List<Skladniki> skladniki;
        private double cena;
        private Waga waga;
        public Builder withSkladniki(List<Skladniki> skladniki){
            this.skladniki = skladniki;
            return this;
        }
        public Builder withCena(double cena){
            this.cena = cena;
            return this;
        }
        public Builder withWaga(Waga waga){
            this.waga = waga;
            return this;
        }
        public Burger stwórz(){
            return new Burger(skladniki, cena, waga);
        }
    }

}
