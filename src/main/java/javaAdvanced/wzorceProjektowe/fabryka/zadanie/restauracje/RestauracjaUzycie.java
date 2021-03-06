package javaAdvanced.wzorceProjektowe.fabryka.zadanie.restauracje;

import java.util.ArrayList;
import java.util.List;

public class RestauracjaUzycie {
    private static List<Burger> zamówioneBurgery = new ArrayList<>();
    public static void main(String[] args) {
        Restauracje wybranaResuracja = RestauracjaFactory.wybierzRestauracje(TypRestauracji.KFC);
        zamówioneBurgery.add(wybranaResuracja.zamów(BurgerTyp.BIG_MAC));
        zamówioneBurgery.add(wybranaResuracja.zamów(BurgerTyp.MC_ROYAL));
        wyświetlZamówienie();
    }
    private static void wyświetlZamówienie(){
        for(Burger burger : zamówioneBurgery){
            System.out.println(burger);
        }
    }
}
