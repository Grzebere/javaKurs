package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie7;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius = radius * percent/100d;
    }
}
