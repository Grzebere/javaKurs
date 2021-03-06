package javaAdvanced.wzorceProjektowe.fabryka.zadanie.restauracje;

import java.util.Arrays;

public class Subway implements Restauracje {
    @Override
    public Burger zamów(BurgerTyp burgerTyp){
        switch(burgerTyp){
            default:
                System.out.println("Nie serwujemy takiego burgera");
                throw new RuntimeException();
        }
    }
}
