package abstractandinterface.phuongtien;

public class XeMay extends PhuongTien {
    private String dungTich;

    public XeMay() {
    }

    public XeMay(String hang, String mau, String ten, double gia, String dungTich) {
        super(hang, mau, ten, gia);
        this.dungTich = dungTich;
    }

    public String getDungTich() {
        return dungTich;
    }

    public void setDungTich(String dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "XeMay{ hang: " + getHang() +
                " mau: " + getMau() +
                " ten: " + getTen() +
                " gia: " + getGia() +
                " dungTich: " + dungTich +
                '}';
    }
}
