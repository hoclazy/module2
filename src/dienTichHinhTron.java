import java.util.Scanner;

public class dienTichHinhTron {
    public static void main(String[] args) {
        double r;
        Scanner acreage = new Scanner(System.in);
        System.out.println("nhap ban kinh: ");
        r = acreage.nextInt();

        System.out.println("dien tich hinh tron la: " +(3.14*r*r));
    }
}
