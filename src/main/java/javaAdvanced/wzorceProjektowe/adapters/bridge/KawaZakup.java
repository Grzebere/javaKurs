package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.List;

public class KawaZakup implements DrinkZakup{
    @Override
    public Drink kup(List<Dodatki> dodatki) {
        return new Kawa(dodatki);
    }
}