package arraylist.library;

public class Magerzine extends Document {
    private int issueNumber;
    private int releaseMonth;

    public Magerzine() {
    }

    public Magerzine(int id, String publishingCompany, int releaseNumber, int issueNumber, int releaseMonth) {
        super(id, publishingCompany, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Magerzine{" + super.toString() +
                "issueNumber=" + issueNumber +
                ", releaseMonth=" + releaseMonth +
                '}';
    }
}
