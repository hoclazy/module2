import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap thang ban can kiem tra: ");
        int month = sc.nextInt();

        if(month == 2) {
            System.out.println("thang 2 co 28 or 29 ngay");
        }
        if(month == 1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
                System.out.println("thang co 31 ngay");
            }
        if (month == 4 || month==6 || month==9 || month==11)  {
            System.out.println("thang do co 30 ngay");
        }
    }
}

