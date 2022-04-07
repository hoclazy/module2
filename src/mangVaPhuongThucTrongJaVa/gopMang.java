package mangVaPhuongThucTrongJaVa;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {4,5,6,7};
        int [] arr = new int[arr1.length+ arr2.length];

        // gán mảng arr1 vào mảng mới
        for(int i = 0; i< arr1.length; i++) {
            arr[i] = arr1[i];
        }

        // gán mảng arr2 vào mảng mới sau khi mảng mới đã gán arr1
        for(int i = 0; i< arr2.length; i++) {
            arr[arr1.length+i] = arr2[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }

//        for( int element : arr1) {
//            arr[i] = element;
//            i++;
//        }
//        for( int element : arr2) {
//            arr[i] = element;
//            i++;
//        }
//
//
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("\n");
    }
}
