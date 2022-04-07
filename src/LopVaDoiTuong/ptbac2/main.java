package LopVaDoiTuong.ptbac2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap  vao a: ");
        double a = sc.nextDouble();
        System.out.println("nhap  vao b: ");
        double b = sc.nextDouble();
        System.out.println("nhap  vao c: ");
        double c = sc.nextDouble();

        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2(a,b,c);
        ptb2.display();
    }
}
