package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie6;

import javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie1.Point2D;

public class MovablePoint extends Point2D implements Movable {
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
