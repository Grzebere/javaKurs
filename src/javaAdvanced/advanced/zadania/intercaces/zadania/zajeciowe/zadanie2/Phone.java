package javaAdvanced.advanced.zadania.intercaces.zadania.zajeciowe.zadanie2;

import java.util.Random;

public class Phone implements Calling {
    protected String number;
    protected int durationOfCalls;

    @Override
    public void call() {
        Random random = new Random();
        int rando = random.nextInt(10);
        if (rando>2){
            int duration = random.nextInt(60);
            System.out.println("Duration of your call: " + duration + "minutes");
            durationOfCalls += duration;
        } else {
            System.out.println("The number you calling is unavalible");
        }
    }

    @Override
    public void callOnAlarmNumber() {
        Random random = new Random();
        int rando = random.nextInt(10);
        if (rando>2){
            int duration = random.nextInt(60);
            System.out.println("Duration of your call: " + duration + " minutes");
            durationOfCalls += duration;
        } else {
            System.out.println("The number you calling is unavalible");
        }
    }

    public int getDurationOfCalls() {
        return durationOfCalls;
    }
}
