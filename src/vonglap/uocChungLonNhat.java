package vonglap;

import java.util.Scanner;

public class uocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao a: ");
        int a = sc.nextInt();

        System.out.println("nhap vao b: ");
        int b = sc.nextInt();

        int c = 1;

        if ( a == 0 || b == 0) {
            System.out.println("uoc chung lon nhat la 1");
            return;
        }

            for( int i = 1; i <= a && i<=b; i++) {
                if(a%i == 0 && b%i==0) {
                    c=i;
                }
            }
            System.out.println("uoc chung lon nhat la: " +c);



    }
}
