package accessmodifier;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle cc = new Circle(7);
        System.out.println(cc.getArea());
    }
}
