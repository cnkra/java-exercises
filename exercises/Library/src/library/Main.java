package library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("Brave New World", "Aldus Huxley", 311);

        System.out.println(book1);
        System.out.println(book2);

        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.printAllBooks();
    }
}