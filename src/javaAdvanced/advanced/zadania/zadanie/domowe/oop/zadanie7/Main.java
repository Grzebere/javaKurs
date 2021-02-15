package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie7;

public class Main {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle( 5);
        System.out.println(resizableCircle.getPerimeter());
        resizableCircle.resize(200);
        System.out.println(resizableCircle.getPerimeter());

    }
}
