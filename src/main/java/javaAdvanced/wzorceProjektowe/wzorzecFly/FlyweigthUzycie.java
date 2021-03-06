package javaAdvanced.wzorceProjektowe.wzorzecFly;

public class FlyweigthUzycie {
    public static void main(String[] args) {
        Car car = CarFactory.stwórzSamochód("Nowy");
        System.out.println(car);
        Car car2 = CarFactory.stwórzSamochód("Stary");
        System.out.println(car2);
        Car car3 = CarFactory.stwórzSamochód("Jakis");
        System.out.println(car3);
    }
}