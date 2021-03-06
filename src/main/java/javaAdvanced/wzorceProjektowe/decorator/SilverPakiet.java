package javaAdvanced.wzorceProjektowe.decorator;

public class SilverPakiet implements MyjniaSamochodowa{
    private PakietStandardowy pakietStantardowy;
    public SilverPakiet(PakietStandardowy pakietStandardowy) {
        this.pakietStantardowy = pakietStandardowy;
    }
    @Override
    public void umyjSamochod() {
        System.out.println("Pakiet silver mycia samochodu");
        pakietStantardowy.umyjSamochod();
    }
}