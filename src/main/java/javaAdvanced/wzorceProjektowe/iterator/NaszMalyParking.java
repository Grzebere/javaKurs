package javaAdvanced.wzorceProjektowe.iterator;

import java.util.Iterator;

public class NaszMalyParking implements Iterable<Samochod>{
    private Samochod[] samochody =  new Samochod[3];
    private int indexDodania = 0;
    public void addSamochod(Samochod samochod){
        if(indexDodania < samochody.length){
            samochody[indexDodania++] = samochod;
        }
    }
    @Override
    public Iterator<Samochod> iterator() {
        return new CarIterator();
    }
    private class CarIterator implements Iterator<Samochod> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < samochody.length && samochody[index] != null;
        }
        @Override
        public Samochod next() {
            return samochody[index++];
        }
    }
}