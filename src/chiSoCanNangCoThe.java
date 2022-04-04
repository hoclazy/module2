import java.util.Scanner;

public class chiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap can nang: ");
        double weight = sc.nextDouble();

        System.out.println("nhap chieu cao: ");
        double height = sc.nextDouble();

        double bmi = weight/(height*height);
        System.out.println("BMI la: " +bmi);

        if (bmi <18) {
            System.out.println("underweight");
        }
        else if (bmi <25) {
            System.out.println("normal");
        }
        else if (bmi <30) {
            System.out.println("overweight");
        }
        else {
            System.out.println("osebe");
        }
    }


}
