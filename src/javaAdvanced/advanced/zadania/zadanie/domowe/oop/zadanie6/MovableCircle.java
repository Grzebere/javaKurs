package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie6;

import javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie3.Circle;

public class MovableCircle extends Circle implements Movable {
    protected MovablePoint circleCenter;

    public MovableCircle(double radius, MovablePoint circleCenter) {
        super(radius);
        this.circleCenter = circleCenter;
    }


    @Override
    public void moveUp() {
        circleCenter.setY(circleCenter.getY()+ circleCenter.getySpeed());
    }

    @Override
    public void moveDown() {
        circleCenter.setY(circleCenter.getY()- circleCenter.getySpeed());
    }

    @Override
    public void moveLeft() {
        circleCenter.setX(circleCenter.getX()- circleCenter.getxSpeed());
    }

    @Override
    public void moveRight() {
        circleCenter.setX(circleCenter.getX()+ circleCenter.getxSpeed());
    }

    public MovablePoint getCircleCenter() {
        return circleCenter;
    }


    @Override
    public String toString() {
        return "MovableCircle{" +
                "circleCenter=" + circleCenter.toString() +
                ", radius=" + radius +
                '}';
    }
}
