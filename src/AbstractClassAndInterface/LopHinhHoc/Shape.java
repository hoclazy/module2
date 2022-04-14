package AbstractClassAndInterface.LopHinhHoc;

public  class Shape implements Resizeable {
    double x, y;

    public Shape() {
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    @Override
    public void resize(double percent) {

    }

}
