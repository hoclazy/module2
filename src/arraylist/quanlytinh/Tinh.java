package arraylist.quanlytinh;

public class Tinh {
    private int maTinh;
    private String nameTinh;
    private int danSo;
    private int gDP;

    public Tinh() {
    }

    public Tinh(int maTinh, String nameTinh, int danSo, int gDP) {
        this.maTinh = maTinh;
        this.nameTinh = nameTinh;
        this.danSo = danSo;
        this.gDP = gDP;
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    public String getNameTinh() {
        return nameTinh;
    }

    public void setNameTinh(String nameTinh) {
        this.nameTinh = nameTinh;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getgDP() {
        return gDP;
    }

    public void setgDP(int gDP) {
        this.gDP = gDP;
    }

    @Override
    public String toString() {
        return "Tinh{" +
                "maTinh=" + maTinh +
                ", nameTinh='" + nameTinh + '\'' +
                ", danSo=" + danSo +
                ", gDP=" + gDP +
                '}';
    }
}
