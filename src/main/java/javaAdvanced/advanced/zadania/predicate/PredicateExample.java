package javaAdvanced.advanced.zadania.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = value -> isPrime(value);
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(17));
    }


    public static boolean isPrime(int number) {
        int count = 0;
        for ( int i = number - 1; i > 0; i-- ) {
            if (number % i == 0) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
