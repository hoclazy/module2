package lopvadoituong.hcn;

public class HinhChuNhat {

    //khai báo chiều dài, chiều rộng
    double width, height;


    //khởi tạo không có tham số
    public HinhChuNhat () {

    }
    //khởi tạo có tham số
    public HinhChuNhat (double width, double height) {
        this.width = width;
        this.height = height;
    }

    // định nghĩa phương thức tính diện tích
    public double getArea() {
        return this.width*this.height;
    }
    // định nghĩa phương thức tính chu vi
    public double getPerimeter() {
        return 2*(this.width+this.height);
    }
//    // định nghĩa phương thức hiển thị chiều dài chiều rộng
//    public String display() {
//        return "hinh chu nhat có chieu dai: " + width + "  chieu rong là: " + height;
//    }




}

