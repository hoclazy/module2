package javacollectionframework.arraylistlinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
//        Product product1 = new Product(1, "bimbim", 5000);
//        Product product2 = new Product(2, "keo mut", 1000);
//        Product product3 = new Product(3, "sua", 7000);
//        Product product4 = new Product(4, "keo  cao su", 10000);

        productManager.add(new Product(5, "sua chua", 5000));

        productManager.display();


    }
}
