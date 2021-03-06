package javaAdvanced.wzorceProjektowe.fasady;

public class OplacenieProduktuImpl implements OplacenieProduktu {
    @Override
    public boolean oplacProdukt(double cena) {
        System.out.println("Produkt został opłacony w cenie: " + cena);
        return true;
    }
}