package kethua;

public class LopShape {

    //khai báo thuộc tính
    private String color = "green";
    private boolean filled = false;

    //khởi tạo không tham số
    public LopShape() {

    }

    public LopShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //getter và setter cho thuộc tính
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "LopShape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
class ShapeTest {
    public static void main(String[] args) {
        LopShape shape = new LopShape("red",true);
        System.out.println(shape);
    }
}
//// khai báo lớp hình tròn kế thừa của lớp hình
// class Circle extends LopShape {
//    private double radius = 1.0;
//
//    //khai báo lớp hình tròn với dạng không có tham số truyền vào
//    //có tham số truyền vào
//    // có tham số truyền  vào + kế thừa thuộc tính của thằng cah
//    public Circle() {
//
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public Circle(double radius, String color, boolean filled) {
//        super(color, filled);
//        this.radius = radius;
//    }
//
//    //get và set thuộc tính
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    // get diện tích, chu vi
//    public double getArea() {
//        return 3.14 * radius * radius;
//    }
//
//    public double getPetimeter() {
//        return 2 * 3.14 * radius;
//    }
//
//    @Override
//    public String toString() {
//        return "Circle{" +
//                "color='" + color + '\'' +
//                ", filled=" + filled +
//                ", radius=" + radius +
//                '}';
//    }
//
//    // to String: in ra kết quả muốn trả về
//
//    //chạy thử
//    class CircleTest {
//        public static void main(String[] args) {
//            Circle cc = new Circle();
//            System.out.println(cc);
//
//            cc = new Circle(5);
//            System.out.println(cc);
//
//        }
//    }
//}


