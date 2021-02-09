package pl.sda.domowe.obiekty;

/*zad 2
        Stwórz klasę Samochód.
        Dodaj do klasy dwa pola:
        String nazwa;
        int predkosc;
        stwórz trzy metody w klasie samochód:
        wypiszInformacjeOSamochodzie():void - która wypisuje informacje o samochodzie (prędkość,
        nazwę itd.)
        przyspieszO5kmh():void - która ma zwiększać wartość prędkości samochodu o 5km/h
        zwolnijO5kmh():void - która ma zmniejszać wartość prędkości samochodu o 5km/h
        przetestuj napisane rozwiaznie*/
public class Samochod {
    String nazwa;
    int predkosc;

    public Samochod(String nazwa, int predkosc) {
        this.nazwa = nazwa;
        this.predkosc = predkosc;
    }

    public Samochod(String nazwa) {
        this.nazwa = nazwa;
    }

    void wypiszInformacjeOSamochodzie() {
        System.out.println("Nazwa samochodu: " + nazwa + ", Prędkość: " + predkosc);
    }

    void przyspieszO5kmh() {
        this.predkosc += 5;
    }

    void zwolnijO5kmh() {
        this.predkosc -= 5;
    }

    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Zuk");
        Samochod samochod2 = new Samochod("Tarpan", 15);
        samochod1.wypiszInformacjeOSamochodzie();
        samochod2.wypiszInformacjeOSamochodzie();
        samochod2.przyspieszO5kmh();
        samochod1.przyspieszO5kmh();
        samochod2.wypiszInformacjeOSamochodzie();
        samochod1.wypiszInformacjeOSamochodzie();
        samochod2.zwolnijO5kmh();
        samochod1.zwolnijO5kmh();
        samochod2.wypiszInformacjeOSamochodzie();
        samochod1.wypiszInformacjeOSamochodzie();


    }

}


