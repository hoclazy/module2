package mangVaPhuongThucTrongJaVa;

import java.util.Scanner;

public class demSoLuongSinhVienThiDo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so luong hoc vien: ");
        int soLuong = sc.nextInt();
        int [] danhSach = new int[soLuong];

        if(soLuong > 30) {
            System.out.println("so luong lon qua khong hien  duoc");
        }

        if(soLuong<30) {
            for (int i = 0; i < danhSach.length; i++) {
                System.out.println("nhap diem hoc vien thu "+(i+1) +"la: ");
                danhSach[i] = sc.nextInt();

            }
        }

        int count = 0;

        for (int i = 0; i < danhSach.length; i++) {

            if (danhSach[i]>=5 && danhSach[i] <=10) {
                count++;

            }

        }
        System.out.println("so luong hoc vien thi do la: " +count);
    }
}
