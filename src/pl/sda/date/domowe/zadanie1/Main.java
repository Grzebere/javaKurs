package pl.sda.date.domowe.zadanie1;

import java.util.Scanner;

/*1. Stwórz aplikację która w pętli przyjmuje polecenie:
        - wpisanie ‘date’ wypisuje obecny LocalDate
        - wpisanie ‘time’ wypisuje obecny LocalTime
        - wpisanie ‘datetime’ wypisuje obecny LocalDateTime
        (W wybranym przez Ciebie formacie)
    Jeśli użytkownik wpisze 'quit' to zakoncz program. */
public class Main {
    public static void main(String[] args) {

    }

    public static String giveOrder(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public static void displayLocalTimeOrDate() {


    }
}