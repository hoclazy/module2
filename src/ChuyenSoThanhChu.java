import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] arr = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};
        String chuoi = null;

        System.out.println("nhập số cần chuyển chữ thành số: ");
        int so = sc.nextInt();

        if(so>=0 && so<=10) {
            chuoi = arr[so];
        }
        if(so>10 && so<20) {
            if (so%10 !=5) {
                chuoi = "muoi" + arr[so%10];
            }else {
                chuoi = "mười lăm";
            }
        }
        if (so>=20 && so<100) {
            if(so%10 == 0) {
                chuoi = arr[so/10] + "mươi";
            }else {
                chuoi = arr[so/10] + "mươi" +(arr[so%10]);
            }
        }
        System.out.println(chuoi);
    }
}
