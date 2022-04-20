package stackandqueue.thapphansangnhiphan;

import java.util.Scanner;
import java.util.Stack;

public class DecimaltoBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("nhap vao so thap phan: ");

        int num = sc.nextInt();
        while (num != 0) {
            int a = num % 2;
            stack.push(a);
            num /= 2;
        }

        System.out.println("gia tri nhi phan la: ");

        while (!(stack.isEmpty())) {
            System.out.println(stack.pop());
        }
    }
}
