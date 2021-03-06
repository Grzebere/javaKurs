package javaAdvanced.wzorceProjektowe.iterator;

import java.util.Iterator;

public class IteratorUzycie {
    public static void main(String[] args) {
        NaszMalyParking naszMalyParking =  new NaszMalyParking();
        naszMalyParking.addSamochod(new Samochod(Model.AUDI));
        naszMalyParking.addSamochod(new Samochod(Model.VOLVO));
        naszMalyParking.addSamochod(new Samochod(Model.SKODA));
        naszMalyParking.addSamochod(new Samochod(Model.AUDI));
//        Parking parking = new Parking(Arrays.asList(new Samochod(Model.AUDI), new Samochod(Model.VOLVO)));
        Iterator<Samochod> parkingInterator = naszMalyParking.iterator();
        while(czyJestJeszczeJakisSamochodNaParking(parkingInterator)){
            Samochod nastepnySamochod = podajNastepnySamochodNaParkingu(parkingInterator);
            System.out.println("Samochod na parkingu to: " + nastepnySamochod.getModel());
        }
    }
    private static boolean czyJestJeszczeJakisSamochodNaParking(Iterator<Samochod> parkingInterator){
        return parkingInterator.hasNext();
    }
    private static Samochod podajNastepnySamochodNaParkingu(Iterator<Samochod> parkingInterator){
        return parkingInterator.next();
    }
}