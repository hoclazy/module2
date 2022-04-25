package arraylist.cadres;

public class Staff extends Cadres{
    private String work;

    public Staff() {
    }

    public Staff(String fullName, int age, String gender, String address, String work) {
        super(fullName, age, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "work='" + work + '\'' +
                '}';
    }
}
