package mangVaPhuongThucTrongJaVa;

import java.util.Scanner;

public class max2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //khai báo mảng 2 chiều có sẵn
        int [][] arr = {
                {1,3,4,6},
                {2,0,3,7},
                {3,2,4,1}
        };

        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if( max<arr[i][j]) {
                    max = arr[i][j];
                }
            }

        }
    System.out.println("gia tri lon nhat mang 2 chieu nay la: "+max);


        //tìm max với mảng nhập vào
        // khai báo số dòng và số cột của ma trận
//        int m, n;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập vào số dòng của ma trận: ");
//        m = scanner.nextInt();
//        System.out.println("Nhập vào số cột của ma trận: ");
//        n = scanner.nextInt();
//
//        // khai báo ma trận A có m dòng, n cột
//        int A[][] = new int[m][n];
//
//        System.out.println("Nhập các phần tử cho ma trận: ");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("A[" + i + "]["+ j + "] = ");
//                A[i][j] = scanner.nextInt();
//            }
//        }
//
//        // tìm phần tử có giá trị lớn nhất trong ma trận
//        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
//        int max = A[0][0];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (max < A[i][j]) {
//                    max = A[i][j];
//                }
//            }
//        }
//
//        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}


