package mangvaphuongthuc;

import java.util.Scanner;

public class giaTriLonNhat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // khai báo đối tượng

        //khai báo biến
        System.out.println("nhap n: ");
        int n = scanner.nextInt();


        int [] arr=  new int[n];

        for(int i = 0; i<n;i++) {
            arr[i] = scanner.nextInt();
        }


        int maxVaLue = arr[0];
        for (int i = 1; i<n; i++) {
            if(arr[i] > maxVaLue) {
                maxVaLue = arr[i];
            }
        }

        System.out.print(maxVaLue);
    }
}
