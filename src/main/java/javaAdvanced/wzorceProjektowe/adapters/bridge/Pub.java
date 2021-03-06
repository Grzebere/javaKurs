package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.List;

public class Pub {
    private DrinkZakup drinkZakup;

    public Pub(DrinkZakup drinkZakup) {
        this.drinkZakup = drinkZakup;
    }

    public void wyświetlZakupyKlienta(List<Dodatki> dodatkiList) {
        Drink drink = drinkZakup.kup(dodatkiList);
        System.out.println("Zakupiony przez nas drink to " + drink.nazwa() + " - cena naszego drinka to: " + drink.cena());
    }
}