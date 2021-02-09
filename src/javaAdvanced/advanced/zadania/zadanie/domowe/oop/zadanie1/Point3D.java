package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie1;

public class Point3D extends Point2D {
    protected float z;


    protected Point3D(float x, float y, float z) {
        super(x, y);
        setZ(z);
    }

    protected float getZ() {
        return z;
    }

    protected void setZ(float z) {
        this.z = z;
    }

    protected float[] getXYZ() {
        float xyz[] = new float[3];
        xyz[0] = this.x;
        xyz[1] = this.y;
        xyz[2] = this.z;
        return xyz;
    }

    protected void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString(){
        return "(" + getX() + ", " + getY() + ", " + z + ")";

    }

}
