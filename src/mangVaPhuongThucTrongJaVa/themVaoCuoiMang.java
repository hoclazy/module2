package mangVaPhuongThucTrongJaVa;

import java.util.Arrays;
import java.util.Scanner;

public class themVaoCuoiMang {
    public static void main(String[] args) {

//        int[] arr = { 10, 20, 30 };
//        System.out.println(Arrays.toString(arr));
//
//        arr = Arrays.copyOf(arr, arr.length + 1);
//        arr[arr.length - 1] = 40; // Assign 40 to the last element
//        System.out.println(Arrays.toString(arr));

        //khai báo mảng
        int[] a = {5,7,8,9,10};
        int[] b =new int[6];

        // chạy for để gán các giá trị từ mảng a sang mảng b
        for (int i = 0; i < a.length; i++) {
            if(i<5){
                b[i]=a[i];
            }

            //thêm phần tử ở vị trí cuối mảng b
            b[5]=15;
        }

        // chạy for hiển thị mảng b
        System.out.println("mang sau khi them phan tu vao cuoi la: ");

        for (int i = 0; i < 6; i++) {
            System.out.print(b[i] +" ");
        }

    }
}
