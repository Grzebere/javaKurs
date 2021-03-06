package javaAdvanced.wzorceProjektowe.decorator;

public class DekoratorUzycie {
    public static void main(String[] args) {
        PakietStandardowy pakietStandardowy = new PakietStandardowy();
        SilverPakiet pakietSilver = new SilverPakiet(pakietStandardowy);
        GoldPakiet pakietGold = new GoldPakiet(pakietSilver);
        PakietPlatinium pakietPlatinium = new PakietPlatinium(pakietGold);
        pakietPlatinium.umyjSamochod();
    }
}