package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie5;

import javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie1.Point2D;

public class Line {
    Point2D pointA;
    Point2D pointB;


    public Line(Point2D pointA, Point2D pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Line(float xPointA, float yPointA, float xPointB, float yPointB) {
        this.pointA = new Point2D(xPointA, yPointA);
        this.pointB = new Point2D(xPointB, yPointB);

    }

    public Point2D getPointA() {
        return pointA;
    }

    public void setPointA(Point2D pointA) {
        this.pointA = pointA;
    }

    public Point2D getPointB() {
        return pointB;
    }

    public void setPointB(Point2D pointB) {
        pointB = pointB;
    }

    public double getLineLength() {
        // c^2 = a^2 + b^2
        return Math.sqrt(Math.pow(Math.abs(this.pointA.getX() - this.pointB.getX()), 2) + Math.pow(Math.abs(this.pointA.getY() - this.pointB.getY()), 2));
    }

    public Point2D getMiddlePoint(){
        return new Point2D((this.pointA.getX() + this.pointB.getX())/2, (this.pointA.getY() + this.pointB.getY())/2);
    }
}
