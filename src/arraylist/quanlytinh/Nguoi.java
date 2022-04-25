package arraylist.quanlytinh;

public class Nguoi extends Tinh {
    private int id;
    private String nameNguoi;
    private int age;
    private Tinh tinh;

    public Nguoi() {
    }

    public Nguoi(int maTinh, String nameTinh, int danSo, int gDP, int id, String nameNguoi, int age, Tinh tinh) {
        super(maTinh, nameTinh, danSo, gDP);
        this.id = id;
        this.nameNguoi = nameNguoi;
        this.age = age;
        this.tinh = tinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameNguoi() {
        return nameNguoi;
    }

    public void setNameNguoi(String nameNguoi) {
        this.nameNguoi = nameNguoi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tinh getTinh() {
        return tinh;
    }

    public void setTinh(Tinh tinh) {
        this.tinh = tinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "id=" + id +
                ", nameNguoi='" + nameNguoi + '\'' +
                ", age=" + age +
                ", tinh='" + tinh.toString() + '\'' +
                '}';
    }
}
