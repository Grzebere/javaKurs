package javaAdvanced.advanced.zadania.threads.task2;



public class Bridge {
    public Bridge() {
    }

    public synchronized void driveThrough(Car car) {
        System.out.println(car.getType() + " " + car.getModel() + " is on the Bridge");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(car.getType() + " " + car.getModel() + " is off the Bridge");

    }
}

