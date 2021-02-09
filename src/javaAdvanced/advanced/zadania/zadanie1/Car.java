package javaAdvanced.advanced.zadania.zadanie1;

public class Car {
    protected int speed;
    protected boolean lightOn;
    protected String colour;
    protected String brand;
    protected int productionYear;

    public Car(String colour, String brand, int productionYear) {
        this.colour = colour;
        this.brand = brand;
        this.productionYear = productionYear;
    }

    public void accelerate() {
        if (speed + 10 < 120) {
            speed += 10;
        } else {
            System.out.println("Too fast. Can't accelarete more.");
        }
    }

    public void lightsOn() {
        lightOn = true;

    }

    protected boolean areTheLightsOn() {
        return lightOn;

    }

    @Override
    public String toString() {
        return colour + " car, brand: " + brand + " from the year of " + productionYear;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) {
            return true;
        }
        if (anotherObject == null && this.getClass() != anotherObject.getClass()) {
            return false;
        }
        Car anotherCar = (Car) anotherObject;
        return (this.brand.equals(anotherCar.brand) && this.colour.equals(anotherCar.colour) && this.productionYear == anotherCar.productionYear);

    }
}

