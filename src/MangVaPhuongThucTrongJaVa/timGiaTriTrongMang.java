package MangVaPhuongThucTrongJaVa;

import java.util.Scanner;

public class timGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = {"nam", "thiên", "huy", "sơn"};

        System.out.print("nhap ten can tim kiem: ");
        String input_name = sc.nextLine();

        boolean check = false;
        for(int i =0; i< arr.length;i++) {
            if(arr[i].equals(input_name)) {
                System.out.println("vi tri  cua sv: " +input_name + " la: " +i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("khong co ten" +input_name +"trong danh sach");
        }

    }
}
