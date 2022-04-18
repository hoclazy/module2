import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("hello world");
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a: ");
        a = scanner.nextInt();

        System.out.println("nhap vao b: ");
        b = scanner.nextInt();

        System.out.println(a+b);
    }
}
