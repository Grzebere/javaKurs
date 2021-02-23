package javaAdvanced.advanced.zadania.wyjatki.zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(divide(scanner.nextDouble(), scanner.nextDouble()));

    }

    public static double divide (double number1, double number2) {
        if(number2==0){
            throw new CannotDivideBy0Exeption();
        }

        return number1/number2;
    }


}


