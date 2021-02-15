package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie1;

public class Point2D {
    protected float x, y;

    public Point2D() {
        setX(0);
        setY(0);
    }

    public Point2D(float x, float y) {
        setX(x);
        setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float xy[] = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";

    }
}
