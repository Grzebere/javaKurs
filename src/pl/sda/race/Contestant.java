package pl.sda.race;

import java.util.Random;

public class Contestant {
    String name;
    int id;
    int speenMin;
    int speedMax;
    int distanceTraveled;

    public Contestant(String name, int id, int speenMin, int speedMax) {
        this.name = name;
        this.id = id;
        this.speenMin = speenMin;
        this.speedMax = speedMax;
    }

    public void itroduceYourself() {
        System.out.println("My name is: " + this.name + ", my number is: " + id + ", i hve been running at speed from " + speenMin + "km/h to" + speedMax + "km/h.");
    }

    public void runForHour() {
        Random random = new Random();
        this.distanceTraveled += random.nextInt((this.speedMax + this.speenMin) / 2);
    }

    public void distanceSoFar() {
        System.out.println(this.name + " run distance of " + distanceTraveled + "km");
    }

}
