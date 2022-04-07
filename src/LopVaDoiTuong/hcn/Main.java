package LopVaDoiTuong.hcn;

import java.util.Scanner;

//tạo class chứa phương thức main để chạy chương trình
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so do chieu dai");
        double width = sc.nextDouble();
        System.out.println("nhap so do chieu rong");
        double height = sc.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(width, height);
//        System.out.println("Your Rectangle \n"+ hcn.display());
        System.out.println("chu vi: "+ hcn.getPerimeter());
        System.out.println("dien tich hcn: "+ hcn.getArea());
    }
}
