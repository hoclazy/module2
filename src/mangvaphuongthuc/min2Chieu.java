package mangvaphuongthuc;

import java.util.Scanner;

public class min2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //khai báo số hàng và số cột của mảng 2 chiều
        System.out.println("nhap so hang: ");
        int a = sc.nextInt();

        System.out.println("nhap so cot: ");
        int b = sc.nextInt();

        //khai báo mảng 2 chiều có a hàng, b cột
        int [][]arr = new int[a][b];
        System.out.println("nhap cac phan tu cua ma tran: " +"\n");

        //duyệt mảng 2 chiều
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("arr[" + i + "]["+ j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        //khai báo min
        int min = arr[0][0];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("min cua mang la: " +min);
    }
}
