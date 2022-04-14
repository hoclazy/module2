package AbstractClassAndInterface.PhuongTien;

import java.util.Arrays;

public class QuanLyOTo implements quanly <OTo>{
    private OTo[] danhSachOto = new OTo[3];
    private int size;
    @Override
    public void them(OTo oTo) {
        danhSachOto[size] = oTo ;
        size++;
    }

    @Override
    public void sua(String name, OTo oTo) {
        danhSachOto[timKiem(name)] = oTo;
    }

    @Override
    public void xoa(String name) {
        danhSachOto[timKiem(name)] = null;
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == danhSachOto[i].getTen()) {
                return i;
            }
        }
        return 0;
    }
    @Override
    public void sapXep() {
        Arrays.sort(danhSachOto);
    }

    @Override
    public void inDanhSach() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSachOto[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyOTo quanLyOTo = new QuanLyOTo();
        OTo car1 = new OTo("toyota", "trang", "Fortuner", 1300000, 7);
        OTo car2 = new OTo("mazda", "trang", "mazda3", 1000000, 4);
        OTo car3 = new OTo("mercedes", "den", "c600", 5000000, 4);
        quanLyOTo.them(car1);
        quanLyOTo.them(car2);
        quanLyOTo.them(car3);
        quanLyOTo.inDanhSach();

        System.out.println("--------------------");

        OTo car4 = new OTo("mercedes", "den", "c300", 5000000, 4);
        quanLyOTo.sua("c600",car4);
        quanLyOTo.inDanhSach();

        System.out.println("---------------- ");

        quanLyOTo.sapXep();
        quanLyOTo.inDanhSach();

        System.out.println("---------------");
        quanLyOTo.xoa("mazda3");
        quanLyOTo.inDanhSach();
    }
}
