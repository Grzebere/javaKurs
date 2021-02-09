package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie1;

public class Point2D {
    protected float x, y;

    public Point2D() {
        setX(0);
        setY(0);
    }

    protected Point2D(float x, float y) {
        setX(x);
        setY(y);
    }

    protected float getX() {
        return x;
    }

    protected void setX(float x) {
        this.x = x;
    }

    protected float getY() {
        return y;
    }

    protected void setY(float y) {
        this.y = y;
    }

    protected float[] getXY() {
        float xy[] = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    protected void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";

    }
}
