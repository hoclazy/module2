package arraylist.library;

public class Book extends Document {
    private String author;
    private int numberOfPages;

    public Book() {
    }

    public Book(int id, String publishingCompany, int releaseNumber, String author, int numberOfPages) {
        super(id, publishingCompany, releaseNumber);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
