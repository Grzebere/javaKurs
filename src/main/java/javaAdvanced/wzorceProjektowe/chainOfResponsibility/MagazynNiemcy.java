package javaAdvanced.wzorceProjektowe.chainOfResponsibility;

public class MagazynNiemcy implements MagazynHandler {
    @Override
    public boolean sprawdzDostępnośćProduktu(Produkt produkt) {
        switch (produkt) {
            case LAPTOP_GAMINOWY:
            case IPHONE:
            case SMARTFONE:
                System.out.println("Produkt " + produkt + " jest dostepny w Niemczech");
                return Boolean.TRUE;
            default:
                System.out.println("Produkt " + produkt + " jest niedostepny w Niemczech");
                return sprawdzWNastepnymMagazynie(produkt);
        }
    }

    private boolean sprawdzWNastepnymMagazynie(Produkt produkt) {
        MagazynHiszpania magazynHiszpania = new MagazynHiszpania();
        return magazynHiszpania.sprawdzDostępnośćProduktu(produkt);
    }
}