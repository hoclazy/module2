package danhsach.listdongian;

import java.util.Arrays;

public class MyList <E>{
    int size = 0;
    int capacity = 10; // capacity: sức chứa
     Object arr[];

    public MyList() {
        Object[] arr = new Object[capacity];
    }



    public void add(E e){
        if (size == arr.length) {
            ensureCapa();
        }
        arr[size++] = e;
    }

    // thay đổi số phần tử tối đa
    public void ensureCapa() {
        int newSize = arr.length + 2;
        arr = Arrays.copyOf(arr, newSize);

    }

    //truy cập từng phần tử
    public void get(int i) {
        if (i>=size) {

        }

    }
}
