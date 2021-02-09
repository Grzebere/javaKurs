package pl.sda.domowe.jeden;

/*9. Napisać program służący do konwersji wartości temperatury podanej w stopniach
        Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
        Celsjusza + 32.0)*/

import java.util.Scanner;

public class Dziwiec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temp_Celsjusz = scanner.nextInt();
        double temp_Fahrenheit = 1.8 * temp_Celsjusz + 32;
        System.out.println(temp_Celsjusz + " stopni Celsjusza to " + temp_Fahrenheit + " stopni Fahrenheit'a.");

    }
}
