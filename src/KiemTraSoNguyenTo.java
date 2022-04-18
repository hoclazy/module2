import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static boolean isPrime(int n) {
        if (n <=1) {
            return false;
        }
        for (int i = 2; i<n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can kiem tra: ");
        int n = sc.nextInt();

        if(isPrime(n)) {
            System.out.println(n+ "la so ngyen to");
        }else {
            System.out.println(n+ "khong phai la so nguyen to");
        }
    }
}
