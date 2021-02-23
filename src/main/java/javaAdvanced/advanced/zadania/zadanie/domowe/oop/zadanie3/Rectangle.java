package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie3;

public class Rectangle extends Shape {
    double width;
    double length;


    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String colour, boolean isFilled, double width, double length) {
        super(colour, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return (this.length * this.width);
    }

    public double getPerimeter() {
        return ((2 * this.width) + (2 * this.length));
    }


    @Override
    public String toString() {
        return "Rectangle with width= " + this.width + " and length= " + this.length + " which is subclass off " + super.toString();
    }
}
