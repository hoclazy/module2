package iotextfile.maxmin;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        File file = new File("inp2.txt");
        if (file.exists()) {
            System.out.println("file da ton tai");
        }
        PrintWriter pw = new PrintWriter(file);
        pw.write("2,5");
        pw.close();

        Scanner sc = new Scanner(file);
        String [] arr = sc.nextLine().split(",");

        double sum = 0;
        double area = 1;
        double max = Integer.parseInt(arr[0]);
        double min = Integer.parseInt(arr[0]);
        for (String s : arr) {
            sum += Integer.parseInt(s);
            area *= Integer.parseInt(s);
            if(max < Integer.parseInt(s)) {
                max = Integer.parseInt(s);
            }
            if ( min > Integer.parseInt(s)) {
                min = Integer.parseInt(s);
            }
        }

        PrintWriter printWriter = new PrintWriter("rs2.txt");
        printWriter.println("tong la: " +sum);
        printWriter.println("tich la: " +area);
        printWriter.println("max la: " + max);
        printWriter.println("min la: " + min);
        printWriter.close();
    }
}
