package javaAdvanced.wzorceProjektowe.chainOfResponsibility;

public class MagazynHiszpania implements MagazynHandler {
    @Override
    public boolean sprawdzDostępnośćProduktu(Produkt produkt) {
        switch (produkt) {
            case LAPTOP_GAMINOWY:
            case IPHONE:
            case SMARTFONE:
            case LAPTOP:
                System.out.println("Produkt " + produkt + " jest dostepny w Hiszpani");
                return Boolean.TRUE;
            default:
                System.out.println("Produkt " + produkt + " jest niedostepny w Hiszpani");
                return sprawdzWNastepnymMagazynie(produkt);
        }
    }

    private boolean sprawdzWNastepnymMagazynie(Produkt produkt) {
        MagazynWlochy magazynWlochy = new MagazynWlochy();
        return magazynWlochy.sprawdzDostępnośćProduktu(produkt);
    }
}