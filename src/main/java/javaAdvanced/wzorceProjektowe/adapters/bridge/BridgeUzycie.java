package javaAdvanced.wzorceProjektowe.adapters.bridge;

import java.util.Arrays;

public class BridgeUzycie {
    public static void main(String[] args) {
        HerbataZakup herbataZakup = new HerbataZakup();
        KawaZakup kawaZakup = new KawaZakup();
        PiwoZakup piwoZakup = new PiwoZakup();
        Osoba osoba = new Osoba("Ben", 16);
        Pub pub = new Pub(herbataZakup);
        Pub pub1 = new Pub(piwoZakup);
        pub.wyświetlZakupyKlienta(Arrays.asList(Dodatki.CYTRYNA, Dodatki.MIOD, Dodatki.MLEKO));
        pub1.wyświetlZakupyKlienta(Arrays.asList(Dodatki.Z_SOKIEM));

    }
}