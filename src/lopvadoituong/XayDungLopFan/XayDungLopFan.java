package lopvadoituong.XayDungLopFan;

public class XayDungLopFan {
    final int slow = 1;
    static final int medium = 2;
    static final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public XayDungLopFan() {
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on == true) {
            return "thong tin quat " + this.speed + " , " + this.color + " , " + this.radius+" quat bat";
        } else {
            return "thong tin quat " + this.color + " , " + this.radius + " , " +this.speed+ " quat tat";
        }
    }
}
class TestFan {

    public static void main(String[] args) {
        XayDungLopFan fan1 = new XayDungLopFan();
        fan1.setSpeed(XayDungLopFan.fast);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("yellow");
        System.out.println(fan1);


        XayDungLopFan fan2 = new XayDungLopFan();
        fan2.setSpeed(XayDungLopFan.medium);
        fan2.setRadius(5);
        fan2.setOn(false);
        fan2.setColor("blue");
        System.out.println(fan2);
    }
}

