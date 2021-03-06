package javaAdvanced.wzorceProjektowe.command;

import javaAdvanced.wzorceProjektowe.chainOfResponsibility.Produkt;

public class CommandUzycie {
    public static void main(String[] args) {
        KoszykProduktow koszykProduktów =  new KoszykProduktow();
        SpecjalnyKoszykProduktow specjalnyKoszyk = new SpecjalnyKoszykProduktow();
        koszykProduktów.dodaj(Produkt.IPHONE);
        koszykProduktów.dodaj(Produkt.TABLET);
//        System.out.println(koszykProduktów.getKoszyk());
        koszykProduktów.usun(Produkt.IPHONE);
//        System.out.println(koszykProduktów.getKoszyk());
        specjalnyKoszyk.dodaj(Produkt.LAPTOP_GAMINOWY);
        System.out.println(specjalnyKoszyk.getKoszyk());
    }
}