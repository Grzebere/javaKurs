package javaAdvanced.wzorceProjektowe.fasady;

public class ZamowienieProduktuFasada {
    private SprawdzenieDostepnosciProduktu sprawdzenieDostepnosciProduktu;
    private OplacenieProduktu oplacenieProduktu;
    private DostarczenieProduktu dostarczenieProduktu;
    public ZamowienieProduktuFasada(SprawdzenieDostepnosciProduktu sprawdzenieDostepnosciProduktu, OplacenieProduktu oplacenieProduktu, DostarczenieProduktu dostarczenieProduktu) {
        this.sprawdzenieDostepnosciProduktu = sprawdzenieDostepnosciProduktu;
        this.oplacenieProduktu = oplacenieProduktu;
        this.dostarczenieProduktu = dostarczenieProduktu;
    }
    public void zamowienie(Produkt produkt){
        if (sprawdzenieDostepnosciProduktu.czyJestDostepny(produkt)){
            if(oplacenieProduktu.oplacProdukt(1500)){
                dostarczenieProduktu.dostarcz(produkt);
            }
        }
    }
}