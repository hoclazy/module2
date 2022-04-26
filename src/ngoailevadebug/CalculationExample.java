package ngoailevadebug;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao x: ");
        int x = sc.nextInt();
        System.out.println("nhap vao y: ");
        int y = sc.nextInt();

        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("tong " + a);
            System.out.println("hieu " + b);
            System.out.println("tich " + c);
            System.out.println("thuong " + d);
        } catch (Exception e) {
            System.out.println("xay ra ngoai le: ");
        }
    }
}
