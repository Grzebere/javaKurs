package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie4;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape(String colour, boolean isFilled) {
        this.color = colour;
        this.isFilled = isFilled;
    }

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    protected String isItFilled(boolean isFilled) {
        if (isFilled) {
            return "filled";
        } else {
            return "not filled";
        }
    }

    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + isItFilled(isFilled);
    }
}
