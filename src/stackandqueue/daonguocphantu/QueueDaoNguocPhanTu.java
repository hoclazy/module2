package stackandqueue.daonguocphantu;

import java.util.*;

public class QueueDaoNguocPhanTu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    Queue<Integer> number = new LinkedList<>();

    while (num>0) {
            number.add(num%10);
            num /= 10;
        }

    while (!number.isEmpty()) {
        System.out.println(number.remove());
    }
    }
}