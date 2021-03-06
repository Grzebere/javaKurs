package javaAdvanced.wzorceProjektowe.wzorzecFly;

import java.util.Map;

public class CarFactory {
    private static final Map<String, Silnik> grupaSilników = Map.of(
            "Nowy", new Silnik(TypSilnika.DIESEL, "2.0"),
            "Stary", new Silnik(TypSilnika.DIESEL, "5.0"),
            "Jakis", new Silnik(TypSilnika.BENZYNA, "6.0")
    );
    public static Car stwórzSamochód(String rodzajSilnika){
        switch(rodzajSilnika){
            case "Nowy":
                return new Car("OPEL", grupaSilników.get(rodzajSilnika), "Czarny");
            case "Stary":
                return new Car("AUDI", grupaSilników.get(rodzajSilnika), "Czerwony");
            case "Jakis":
                return new Car("FIAT", grupaSilników.get(rodzajSilnika), "Bialy");
            default:
                throw new RuntimeException();
        }
    }
}