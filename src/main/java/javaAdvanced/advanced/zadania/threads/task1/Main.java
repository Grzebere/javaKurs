package javaAdvanced.advanced.zadania.threads.task1;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Thread1());
        Thread th2 = new Thread(new Thread2());
        th1.start();
        th2.start();

    }
}
