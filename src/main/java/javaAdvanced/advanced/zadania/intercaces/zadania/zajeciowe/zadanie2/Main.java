package javaAdvanced.advanced.zadania.intercaces.zadania.zajeciowe.zadanie2;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        System.out.println(phone.getDurationOfCalls());
        phone.call();
        System.out.println(phone.getDurationOfCalls());
        phone.callOnAlarmNumber();
        System.out.println(phone.getDurationOfCalls());

    }
}
