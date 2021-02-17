package javaAdvanced.advanced.zadania.kolekcje.zadania.zadanie2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Set<Figura> figury = new HashSet<>();
        //Set<Figura> figury = new LinkedHashSet<>();
        Set<Figura> figury = new TreeSet<>();

        Kwadrat kwadrat1 = new Kwadrat(3);
        Kwadrat kwadrat2 = new Kwadrat(4);
        Kwadrat kwadrat3 = new Kwadrat(6);
        Prostokat prostokat1 = new Prostokat(2, 5);
        Prostokat prostokat2 = new Prostokat(4, 4);
        Prostokat prostokat3 = new Prostokat(6, 8);
        figury.add(kwadrat1);
        figury.add(kwadrat2);
        figury.add(kwadrat3);
        figury.add(prostokat1);
        figury.add(prostokat2);
        figury.add(prostokat3);
        System.out.println(figury);


    }



}
