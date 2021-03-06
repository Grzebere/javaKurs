package javaAdvanced.advanced.zadania.threads.task2;

public class Main {
    public static void main(String[] args) {
        final Car car1 = new Car("BMW", "SUV");
        final Car car2 = new Car("Audi", "Toy car");
        final Bridge bridge = new Bridge();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car1);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car2);
            }
        });

        thread1.start();
        thread2.start();
    }
}
