package nhap_xuat_du_lieu_codelearn;
import java.util.Scanner;
public class TenVaDiaChi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String address = sc.next();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
