package javaAdvanced.wzorceProjektowe.iterator;

import java.util.Iterator;
import java.util.List;

public class Parking implements Iterable<Samochod>{
    private List<Samochod> samochody;
    public Parking(List<Samochod> samochody) {
        this.samochody = samochody;
    }
    @Override
    public Iterator<Samochod> iterator() {
        return samochody.iterator();
    }
}