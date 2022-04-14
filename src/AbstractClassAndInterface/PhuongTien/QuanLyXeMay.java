package AbstractClassAndInterface.PhuongTien;

import java.util.Arrays;

public class QuanLyXeMay implements quanly<XeMay>{
    private XeMay[] danhSach = new XeMay[5];
    private int size = 0;
    @Override
    public void them(XeMay xeMay) {
      danhSach[size] = xeMay;
      size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {
        danhSach[timKiem(name)] = new XeMay();
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i< size; i++) {
            if(name == danhSach[i].getTen()){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void sapXep() {

    }

    @Override
    public void inDanhSach() {
        for (int i = 0; i<size; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyXeMay ql = new QuanLyXeMay();
        XeMay xm1 = new XeMay("honda" , "den", "cub", 100, "50cc");
        XeMay xm2 = new XeMay("honda" , "trang", "waveS", 20, "110cc");
        ql.them(xm1);
        ql.them(xm2);
        ql.inDanhSach();
        System.out.println("vi tri cua xe la " + ql.timKiem("cub"));

        XeMay xm3 = new XeMay("honda" , "trang", "SH", 50, "150cc");
        ql.sua("waveS", xm3);
        ql.inDanhSach();
        System.out.println("--------------------");
        ql.xoa("cub");
        ql.inDanhSach();

        System.out.println( "----------------------");


    }
}
