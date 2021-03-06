package javaAdvanced.wzorceProjektowe.strategy;

public class WyborPlatnosci {
    public static Payment wybierzSposobPlatnosci(SposobPlatnosc sposobPlatnosc){
        switch(sposobPlatnosc){
            case BANK:
                return new BankPayment();
            case PAYPAL:
                return new Paypal();
            case BITCOIN:
                return new Bitcoin();
            default:
                System.out.println("Nie obsługujemy takiego rodzaju platnosci.");
                throw new RuntimeException();
        }
    }
}