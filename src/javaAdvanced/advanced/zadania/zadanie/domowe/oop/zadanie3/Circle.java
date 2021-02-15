package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie3;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
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

    public double getArea(){
        return (Math.PI * Math.pow(this.radius,2));
    }

    public double getPerimeter(){
        return (2* Math.PI * this.radius );
    }

    @Override
    public String toString() {
        return "Circle with radius= " + radius + " which is subclass off " + super.toString();
    }
}
