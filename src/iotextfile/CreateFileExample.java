package iotextfile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class CreateFileExample {
    public static void main(String[] args) throws Exception {
        File file11 = new File("inp1.txt");

        if (file11.exists()) {
            System.out.println("file da ton tai");
        }

        PrintWriter writer = new PrintWriter(file11);
        writer.write("2,3");
        writer.close();

        Scanner sc = new Scanner(file11);

        String [] arr = sc.nextLine().split(",");
        double x = -Double.parseDouble(arr[1])/Double.parseDouble(arr[0]);
        System.out.println(x);


        PrintWriter pw=new PrintWriter("rs.txt");
        pw.write("nghiem cua pt la: " +x);
        pw.close();

    }
}