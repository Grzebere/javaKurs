package javaAdvanced.wzorceProjektowe.command;

import javaAdvanced.wzorceProjektowe.chainOfResponsibility.Produkt;

public interface PrzyciskKoszyka {
    void dodaj(Produkt produkt);
    void usun(Produkt produkt);
}