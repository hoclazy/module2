package KeThua.Point;

public class Point2D {
    float x;
    float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(float x, float y) {
        return new float[]{x,y};
    }

    public static void main(String[] args) {
        Point2D pd = new Point2D(2,3);
        System.out.println(pd);
    }
}

class Point3D extends Point2D {
    float z;

    public Point3D() {
    }

    public Point3D(float x, float y,float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public  void setXYZ(float x, float y , float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ(float x, float y, float z) {
        return new float[] {x,y,z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D ab = new Point3D(3f, 2f,4f);
        System.out.println(ab);

    }
}
