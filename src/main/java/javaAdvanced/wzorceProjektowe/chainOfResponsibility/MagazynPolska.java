package javaAdvanced.wzorceProjektowe.chainOfResponsibility;

public class MagazynPolska implements MagazynHandler {
    @Override
    public boolean sprawdzDostępnośćProduktu(Produkt produkt) {
        switch (produkt) {
            case LAPTOP:
            case IPHONE:
            case SMARTFONE:
                System.out.println("Produkt " + produkt + " jest dostepny w Polsce");
                return Boolean.TRUE;
            default:
                System.out.println("Produkt " + produkt + " jest niedostepny w Polsce");
                return sprawdzWNastepnymMagazynie(produkt);
        }
    }

    private boolean sprawdzWNastepnymMagazynie(Produkt produkt) {
        MagazynNiemcy magazynNiemcy = new MagazynNiemcy();
        return magazynNiemcy.sprawdzDostępnośćProduktu(produkt);
    }
}