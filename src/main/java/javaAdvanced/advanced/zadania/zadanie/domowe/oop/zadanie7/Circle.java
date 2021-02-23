package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie7;

public class Circle extends javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie3.Circle implements GeometricObject {

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
