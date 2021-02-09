package javaAdvanced.advanced.zadania.zadanie1;

public class Main {
    public static void main(String[] args) {
        Cabriolet cabriolet = new Cabriolet("Blue", "Audi", 1990);
        System.out.println(cabriolet.isRoofHidden());
        cabriolet.hideRoof();
        System.out.println(cabriolet.isRoofHidden());
        System.out.println(cabriolet.areTheLightsOn());
        cabriolet.lightsOn();
        System.out.println(cabriolet.areTheLightsOn());
        System.out.println(cabriolet.toString());
    }
}
