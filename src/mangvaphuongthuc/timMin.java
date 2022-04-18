package mangvaphuongthuc;
import java.util.Scanner;
public class timMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // khai báo đối tượng

        //khai báo biến

        System.out.println("nhap so luong phan tu trong mang: ");

        int n = scanner.nextInt();

        //khai báo mảng
        int [] arr=  new int[n];

        // dùng for chạy hiện mảng
        for(int i = 0; i<n;i++) {
            System.out.println("nhap phan tu thu: " +(i+1));
            arr[i] = scanner.nextInt();
        }

        //khai báo min và điều kiện của min
        int minVaLue = arr[0];
        for (int i = 1; i<n; i++) {
            if(arr[i] < minVaLue) {
                minVaLue = arr[i];
            }
        }

        // hiển thị min
        System.out.print("phan tu nho nhat trong mang la: "+minVaLue);
    }
}
