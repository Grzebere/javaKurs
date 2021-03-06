package javaAdvanced.wzorceProjektowe.fasady;

public class DostarczenieProduktuImpl implements DostarczenieProduktu{
    @Override
    public void dostarcz(Produkt produkt) {
        System.out.println("Produkt: " + produkt +" został dostarczony");
    }
}