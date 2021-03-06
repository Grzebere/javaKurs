package javaAdvanced.wzorceProjektowe.chainOfResponsibility;

public class MagazynWlochy implements MagazynHandler {
    @Override
    public boolean sprawdzDostępnośćProduktu(Produkt produkt) {
        switch (produkt) {
            case LAPTOP_GAMINOWY:
            case IPHONE:
            case SMARTFONE:
            case LAPTOP:
            case TABLET:
                System.out.println("Produkt " + produkt + " jest dostepny we Włoszech");
                return Boolean.TRUE;
            default:
                System.out.println("Produkt " + produkt + " jest niedostepny we Włoszech");
                return Boolean.FALSE;
        }
    }
}
