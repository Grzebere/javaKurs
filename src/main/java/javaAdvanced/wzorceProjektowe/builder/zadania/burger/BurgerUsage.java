package javaAdvanced.wzorceProjektowe.builder.zadania.burger;

import java.util.ArrayList;
import java.util.List;

public class BurgerUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Beef");
        list.add("Cheese");
        list.add("Tomato");
        list.add("Pickle");
        final Burger burger = new Burger.Builder()
                .withListaSkladnikow(list)
                .withCena(15d)
                .withWaga(300)
                .build();
        System.out.println(burger);
    }

}
