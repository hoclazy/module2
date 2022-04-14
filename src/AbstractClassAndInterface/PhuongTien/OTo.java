package AbstractClassAndInterface.PhuongTien;

public class OTo extends PhuongTien{
    private int soCho;

    public OTo() {
    }

    public OTo(String hang, String mau, String ten, double gia, int soCho) {
        super(hang, mau, ten, gia);
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return "OTo{" +
                "soCho=" + soCho +
                '}';
    }
}
