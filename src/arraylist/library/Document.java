package arraylist.library;

public class Document {
    private static int autoid = 1;
    private int number;
    private String publishingCompany;
    private int releaseNumber;

    public Document() {
    }

    public Document(int number, String publishingCompany, int releaseNumber) {
        this.number = autoid;
        autoid++;
        this.publishingCompany = publishingCompany;
        this.releaseNumber = releaseNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
