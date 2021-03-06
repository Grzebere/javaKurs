package javaAdvanced.wzorceProjektowe.decorator;

public class GoldPakiet implements MyjniaSamochodowa{
    private SilverPakiet silverPakiet;
    public GoldPakiet(SilverPakiet silverPakiet) {
        this.silverPakiet = silverPakiet;
    }
    @Override
    public void umyjSamochod() {
        System.out.println("Pakiet gold myjni samochodowej");
        silverPakiet.umyjSamochod();
    }
}