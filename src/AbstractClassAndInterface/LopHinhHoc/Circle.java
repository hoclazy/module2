package AbstractClassAndInterface.LopHinhHoc;

public class Circle extends Shape implements Resizeable,ColorAble {
    double radius;

    public Circle() {
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double dienTich() {
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +super.toString() +
                "radius=" + radius +
                ", dienTích=" + dienTich() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius*(percent/100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }




}
