import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so tien can chuyen: ");
        double VND = sc.nextDouble();


        double USD = VND/23000;
        System.out.println("ban doi duoc: " +USD);
    }
}
