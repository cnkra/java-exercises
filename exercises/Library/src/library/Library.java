package library;

import java.util.List;
import java.util.ArrayList;

public class Library {

    List<Book> list = new ArrayList<>();

    public void addBook(Book book){
        list.add(book);
    }
    public void printAllBooks(){
        System.out.println("All Books:");
        for (Book book : list)
            System.out.println(book);
    }
    public Book findBookByAuthor(String author) {
        for (Book book : list) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        System.out.println("There is no book by " + author);
        return null;
    }

    public void removeByTitle(String title){
        list.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public int getTotalBooks(){
        return list.size();
    }
}
