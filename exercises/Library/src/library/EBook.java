package library;

public class EBook extends Book {

    private String downloadLink;

    public EBook (String title, String author, int pages, String downloadLink) {
        super(title, author, pages);
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }
    @Override
    public String toString() {
        return super.toString() + ", downloadLink='" + downloadLink + "\'";
    }
}
