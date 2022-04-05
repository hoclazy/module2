package mangVaPhuongThucTrongJaVa;

import java.util.Scanner;

public class xoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //khai báo số phần tử của mảng
        System.out.println("nhap so phan tu cua mang: " );
        int soPhanTu = sc.nextInt();

        //khai báo mảng
        int [] arr = new int[soPhanTu];
        for (int i = 0; i< arr.length;i++) {
            System.out.println("nhap phan tu thu: "+i);
            arr[i] = sc.nextInt();
        }
        inMang(arr);

        //khai báo số cần xóa và vị trí cần xóa
        System.out.println("nhap so can xoa: ");
        int soCanXoa = sc.nextInt();
        int viTriXoa = timViTriPhanTu(arr,soCanXoa);

       //khai báo mảng mới
        int [] newArr = new int[arr.length-1];
        for (int i =0; i<viTriXoa;i++) {
            newArr[i] = arr[i];
        }
        for (int i = viTriXoa; i< arr.length;i++) {
            newArr[i] = arr[i+1];
        }
        arr = newArr;
        inMang(arr);
    }

    static int timViTriPhanTu(int[] arr, int soCanXoa) {

        int viTriXoa = -1;
        return viTriXoa;
    }

    private static void inMang(int[] mang) {
        System.out.println("mảng là: ");
        for (int i = 0;i< mang.length;i++) {
            System.out.println((mang[i]) +"\t");
        }
    }
}
