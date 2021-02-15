package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie4;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(String colour, boolean isFilled, double radius) {
        super(colour, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }

    @Override
    public String toString() {
        return "Circle with radius= " + radius + " which is subclass off " + super.toString();
    }
}
