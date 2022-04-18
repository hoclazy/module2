package nhap_xuat_du_lieu_codelearn;

import java.util.Scanner;

class Rectangle{
    double length;
    double width;

    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }
    public void display(){
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}
 class Entry {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Rectangle r = new Rectangle();
         r.getInformation();
         r.display();
     }
}
