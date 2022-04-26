package ngoailevadebug.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("________Menu________ ");
            System.out.println("1. hien thi ");
            System.out.println("2. them ");
            System.out.println("3.sua ");
            System.out.println("4.xoa ");
            System.out.println("5.thoat");
            System.out.println("nhap lua chon: ");

            try {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 5) {
                    throw new Exception();
                }
            } catch (InputMismatchException e) {
                System.out.println("chi dc nhap so: ");
            } catch (Exception e) {
                System.out.println(" chi duoc nhap trong khoang 1-5");;
            }
            switch (choice) {
                case 1:
                    System.out.println("hien thi danh sach");
                    break;
                case 2:
                    System.out.println("them");
                    break;
                case 3:
                    System.out.println("sua");
                    break;
                case 4:
                    System.out.println("xoa");
                    break;
                case 5:
                    System.out.println("thoat");
                    System.exit(0);

            }
        }
    }
}
