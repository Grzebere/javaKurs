package javaAdvanced.wzorceProjektowe.template.zadanie2;

import javaAdvanced.wzorceProjektowe.template.zadanie1.HeroTemplate;

public class TemplateUzycie {
    public static void main(String[] args) {
        GoblinTemplate mocnyGoblin =  new SuperGoblin();
        GoblinTemplate slabyGoblin = new WeakGoblin();
        GoblinTemplate normalGoblin = new NormalGoblin();
        System.out.println("Moc ataku slabego Hero rowna: " + slabyGoblin.silaAtakuGoblina());
        System.out.println("Moc ataku mocnego Hero rowna: " + mocnyGoblin.silaAtakuGoblina());
        System.out.println("Moc ataku normalnego Hero rowna: " + normalGoblin.silaAtakuGoblina());


    }

    private static void walka(HeroTemplate hero, GoblinTemplate goblin) {
        if (hero.silaAtakuBohatera() > goblin.silaGoblina()) {
            System.out.println("Wybrał bohater");
        } else {
            System.out.println("Wybrał goblin");
        }
    }
}