package mangvaphuongthuc;

import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int choice;

        System.out.println("Menu");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Celcius");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter fahrenheit");
                F = sc.nextDouble();
                System.out.println("Fahrenheit to Celcius" + farenheitToCelcius(F));
                break;
            case 2:
                System.out.println("Enter celicus");
                C = sc.nextDouble();
                System.out.println("celcius to fahrenheit" + celciusToFahrenheit(C));
                break;
            case 0:
                System.exit(0);
        }

    }

    public static double celciusToFahrenheit( double C) {
        double F = (9/5) * C + 32;
        return F;
    }

    public static double farenheitToCelcius( double F) {
        double C = (5/9) *(F-32);
        return C;
    }

}
