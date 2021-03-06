package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.List;

public class SzampanZakup implements DrinkZakup {
        @Override
        public Drink kup(List<Dodatki> dodatki) {
            return new Szampan(dodatki);
        }
}
