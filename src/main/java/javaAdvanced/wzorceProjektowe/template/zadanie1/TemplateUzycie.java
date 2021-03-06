package javaAdvanced.wzorceProjektowe.template.zadanie1;

public class TemplateUzycie {
    public static void main(String[] args) {
        HeroTemplate mocnyBohater =  new SuperHero();
        HeroTemplate slabyBohater = new WeakHero();
        HeroTemplate normalBohater = new NormalHero();
        System.out.println("Moc ataku slabego Hero rowna: " + slabyBohater.silaAtakuBohatera());
        System.out.println("Moc ataku mocnego Hero rowna: " + mocnyBohater.silaAtakuBohatera());
        System.out.println("Moc ataku mocnego Hero rowna: " + normalBohater.silaAtakuBohatera());
    }
}