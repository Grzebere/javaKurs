package javaAdvanced.wzorceProjektowe.fasady;

public class FasadaUzycie {
    public static void main(String[] args) {
        ZamowienieProduktuFasada zamowienieProduktuFasada =  new ZamowienieProduktuFasada(new SprawdzDostepnoscProduktuImpl(), new OplacenieProduktuImpl(), new DostarczenieProduktuImpl());
        zamowienieProduktuFasada.zamowienie(Produkt.KOSMETYKI);
        zamowienieProduktuFasada.zamowienie(Produkt.MASECZKI);
    }
}