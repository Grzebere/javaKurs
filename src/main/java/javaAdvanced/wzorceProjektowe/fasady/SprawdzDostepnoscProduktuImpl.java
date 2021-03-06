package javaAdvanced.wzorceProjektowe.fasady;

public class SprawdzDostepnoscProduktuImpl implements SprawdzenieDostepnosciProduktu {
    @Override
    public boolean czyJestDostepny(Produkt produkt) {
        if (produkt == Produkt.KOSMETYKI) {
            System.out.println("Produkt: " + produkt + " jest dostępny ");
            return true;
        }
        if (produkt == Produkt.MASECZKI) {
            System.out.println("Produkt: " + produkt + " jest niedostępny ");
            return false;
        } else {
            System.out.println("Produkt: " + produkt + " jest niedostępny ");
            return false;
        }

    }
}