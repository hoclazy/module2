package arraylist.library;

public class Newspaper extends Document {
    private int relaeseDay;

    public Newspaper() {
    }

    public Newspaper(int id, String publishingCompany, int releaseNumber, int relaeseDay) {
        super(id, publishingCompany, releaseNumber);
        this.relaeseDay = relaeseDay;
    }

    public int getRelaeseDay() {
        return relaeseDay;
    }

    public void setRelaeseDay(int relaeseDay) {
        this.relaeseDay = relaeseDay;
    }

    @Override
    public String toString() {
        return "Newspaper{" + super.toString() +
                "relaeseDay=" + relaeseDay +
                '}';
    }
}
