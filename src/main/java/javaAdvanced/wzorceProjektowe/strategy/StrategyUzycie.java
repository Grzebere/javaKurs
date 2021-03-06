package javaAdvanced.wzorceProjektowe.strategy;

public class StrategyUzycie {
    public static void main(String[] args) {
        Payment wybranaFormaPlatnosci = WyborPlatnosci.wybierzSposobPlatnosci(SposobPlatnosc.BITCOIN);
        wybranaFormaPlatnosci.oplac(100);
    }
}