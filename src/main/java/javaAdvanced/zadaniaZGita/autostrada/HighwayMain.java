package javaAdvanced.zadaniaZGita.autostrada;

import java.util.Scanner;

public class HighwayMain {
    public static void main(String[] args)  {
        start();

    }

    public static void start()  {
        Scanner scanner = new Scanner(System.in);
        boolean temp = true;
        Highway highway = new Highway();
        while (temp) {
            System.out.println("Enter command: ");
            String tempCommand = scanner.nextLine();
            String[] commandArray = tempCommand.split(" ");

            switch (commandArray[0].toLowerCase()) {
                case ("wjazd"):
                    highway.vehicleEntry(commandArray[1], CarType.valueOf(commandArray[2].toUpperCase()));
                    break;
                case ("wyjazd"):
                    highway.vehicleLeave(commandArray[1]);
                    break;
                case ("sprawdz"):
                    highway.searchVehicle(commandArray[1]);
                    break;
                default:
                    temp = false;
            }
        }

    }


}
