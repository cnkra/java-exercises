package library;

public class Book
{
    private String title;
    private String author;
    private int pages;

    Book(String book, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        return "Book:{" +
                "book ='" + title + "\'" +
                ", author = '" + author + '\'' +
                ", pages = " + pages +
                '}';
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }
}

