package javaAdvanced.advanced.zadania.kolekcje.zadania.zadanie3;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GraLotto {


    public void zagraj() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> sixNumbers = new HashSet();
        for ( int i = 0; i < 6; i++ ) {
            int number = scanner.nextInt();
            if (number >= 1 && number <= 49) {
                sixNumbers.add(number);
            } else {
                System.out.println("Number out of bounds");
            }
        }
        System.out.println(sixNumbers);
        Set<Integer> casino = przeprowadzLosowanie();
        System.out.println(casino);
        System.out.println(zwrocWynik(sixNumbers, casino));

    }

    private Set przeprowadzLosowanie() {
        Random random = new Random();
        Set<Integer> sixNumbers = new HashSet();
        for ( int i = 0; i < 6; i++ ) {
            sixNumbers.add(random.nextInt(48) + 1);
        }
        return sixNumbers;
    }

    private int zwrocWynik(Set<Integer> playerNumbers, Set<Integer> casinoNumbers) {
        int count = 0;
        for ( int number : playerNumbers
        ) {
            if (casinoNumbers.contains(number)) {
                count++;
            }

        }
        return count;
    }


}

