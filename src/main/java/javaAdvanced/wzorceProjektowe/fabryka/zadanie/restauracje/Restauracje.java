package javaAdvanced.wzorceProjektowe.fabryka.zadanie.restauracje;

public interface Restauracje {

        /**
         * Pozwala zamówić burgera określonego typu
         * @param burgerTyp typ burgera
         * @return zwraca nam konkretnego burgera
         */
        Burger zamów(BurgerTyp burgerTyp);
    }

