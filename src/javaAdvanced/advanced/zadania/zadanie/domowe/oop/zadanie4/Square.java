package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie4;

public class Square extends Rectangle {


    public Square(String colour, boolean isFilled, double width) {
        super(colour, isFilled, width, width);
    }

    public Square() {
    }


    @Override
    public String toString() {
        return "Square" + super.toString().substring(10);
    }
}
