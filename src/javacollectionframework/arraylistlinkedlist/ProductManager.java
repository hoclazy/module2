package javacollectionframework.arraylistlinkedlist;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> productArrayList;

    public ProductManager() {
    }

    public ProductManager(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void add(Product product) {
        productArrayList.add(product);
    }

    public int search(String name) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return 0;
    }

    public int search(int id) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                return i;
            }
        }
        return 0;
    }

    public void set(int id) {
        productArrayList.set(id, new Product());
    }

    public void remove(int id) {
        productArrayList.remove(id);
    }

    public void sort(int price) {

    }

    public void display() {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(productArrayList.get(i).toString());
        }
        System.out.println("danh sách sản phẩm: ");
    }
}

