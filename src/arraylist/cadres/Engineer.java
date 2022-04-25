package arraylist.cadres;

public class Engineer extends Cadres{
    private String technique;

    public Engineer() {
    }

    public Engineer(String fullName, int age, String gender, String address, String technique) {
        super(fullName, age, gender, address);
        this.technique = technique;
    }

    public Engineer(String technique) {
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "technique='" + technique + '\'' +
                '}';
    }
}
