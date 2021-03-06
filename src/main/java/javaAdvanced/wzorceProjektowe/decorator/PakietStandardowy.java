package javaAdvanced.wzorceProjektowe.decorator;

public class PakietStandardowy implements MyjniaSamochodowa{
    @Override
    public void umyjSamochod() {
        System.out.println("Standardowe mycie samochodu");
    }
}