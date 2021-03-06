package javaAdvanced.wzorceProjektowe.builder.zadania.burger;

import java.util.List;

public class Burger {

    private List<String> listaSkladnikow;
    private double cena;
    private double waga;

    private Burger(List<String> listaSkladnikow, double cena, double waga) {
        this.listaSkladnikow = listaSkladnikow;
        this.cena = cena;
        this.waga = waga;
    }

    public List<String> getListaSkladnikow() {
        return listaSkladnikow;
    }

    public double getCena() {
        return cena;
    }

    public double getWaga() {
        return waga;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "listaSkladnikow=" + listaSkladnikow +
                ", cena=" + cena +
                ", waga=" + waga +
                '}';
    }


    public static class Builder {
        private List<String> listaSkladnikow;
        private double cena;
        private double waga;

        // metody budownicze
        public Builder withListaSkladnikow(final List<String> listaSkladnikow) {
            this.listaSkladnikow = listaSkladnikow;
            return this;
        }

        public Builder withCena(final Double cena) {
            this.cena = cena;
            return this;
        }

        public Builder withWaga(final double waga) {
            this.waga = waga;
            return this;
        }

        // metoda budująca obiekt docelowy
        public Burger build() {
            return new Burger(listaSkladnikow, cena, waga);
        }
    }
}

