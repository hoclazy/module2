package vonglap;

import java.util.Scanner;

public class kiemTraSoNguyenTo {
    public static boolean isPrime(int n) {
        if ( n<=1) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai báo đối tượng

        System.out.println("nhap so nguyen can kiem tra: ");
        int n = sc.nextInt();
        //nhập số nguyên cần kiểm tra

        if (isPrime(n)) {
            System.out.println(n + "la so nguyen to");
        } else {
            System.out.println(n+ "khong phai la so nguyen to");
        }
    }
}
