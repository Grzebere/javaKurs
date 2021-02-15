package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie6;

public class Main {
    public static void main(String[] args) {
        MovablePoint pointA = new MovablePoint(3, 4, 2, 3);
        System.out.println(pointA.toString());
        pointA.moveLeft();
        pointA.moveDown();
        System.out.println(pointA.toString());
        MovableCircle circleA = new MovableCircle(5, new MovablePoint(5, 5, 4, 7));
        System.out.println(circleA.toString());
        circleA.moveUp();
        circleA.moveRight();
        System.out.println(circleA.toString());
    }
}
