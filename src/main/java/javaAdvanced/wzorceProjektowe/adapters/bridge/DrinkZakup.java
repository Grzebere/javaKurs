package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.List;

public interface DrinkZakup {
    Drink kup(List<Dodatki> dodatki);
}