package mangVaPhuongThucTrongJaVa;

import java.util.Scanner;

public class tongCot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //khai bao hang
        System.out.println("nhap so hang: ");
        int m = sc.nextInt();

        //khai báo cột
        System.out.println("nhap so cot: ");
        int n = sc.nextInt();

        //khai báo mảng
        int arr [][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("arr[" +i +"][" +j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        // khai báo số cột muốn tính tổng
        System.out.println("nhap so cot muon tinh tong: ");
        int a = sc.nextInt();

        if ( a>=n) {
            System.out.println("khong ton tai cot do:");
        }
        else{
            int tongCot = 0;
            for (int i = 0; i < m; i++)
                tongCot += arr[i][a];
            System.out.println("tong cot " +a + " la: " + tongCot);
        }
    }
}
