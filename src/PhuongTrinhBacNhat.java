import java.util.Scanner;

public class PhuongTrinhBacNhat {
    //khai báo lớp

    public static void main(String[] args) {
        Scanner bacNhat = new Scanner(System.in);
        //khai báo đối tượng

        System.out.println("nhap vao a: ");
        double a = bacNhat.nextDouble();
        //khai báo a

        System.out.println("nhap vao b: ");
        double b = bacNhat.nextDouble();
        //khai báo b

        System.out.println("pt co nghiem la: " +(-b/a));
        //in ra kết quả
    }
}
