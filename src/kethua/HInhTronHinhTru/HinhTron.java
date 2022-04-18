package kethua.HInhTronHinhTru;

//khai báo thuộc tính của đối tượng
public class HinhTron {
    double radius;
    String mau;

    // khởi tạo đối tượng không có và có tham số truyền vào


    public HinhTron() {

    }

    public HinhTron(double radius, String mau) {
        this.radius = radius;
        this.mau = mau;
    }

    //get và set tham số
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    // tính diện tích
    public double getArea() {
        return 3.14*radius*radius;
    }

    // cài đè toString để in ra kết quả

    public String toString () {
        return "hinh tron co ban kinh la: " +getRadius()+ " co mau " +getMau() + " co dien tich la " + getArea();
    }
}

// test thử chạy
class testHinhTron {
    public static void main(String[] args) {
        HinhTron htron = new HinhTron(5,"red");
        System.out.println(htron);
    }
}

class HinhTru extends HinhTron {
    private double cao;

    public HinhTru() {
    }

    public HinhTru(double radius, String mau, double cao) {
        super(radius, mau);
        this.cao = cao;
    }

    public double getCao() {
        return cao;
    }

    public void setCao(double cao) {
        this.cao = cao;
    }

    public double getVolume() {
        return 3.14*cao*radius*radius;
    }

    public String toString() {
        return "hinh tru co chieu cao " + getCao() +" co mau " +getMau()+ " co the tich la: " + getVolume();
    }

}

class testTru {
    public static void main(String[] args) {
        HinhTru htru = new HinhTru(5, "red", 4);
        System.out.println(htru);
    }

}