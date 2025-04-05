package library;

public class PrintedBook extends Book{
    private double weight;
    private boolean hardcover;

    public PrintedBook (String title, String author, int pages, double weight, boolean hardcover) {
        super(title, author, pages);
        this.weight = weight;
        this.hardcover = hardcover;
    }

    public void ship() {
        System.out.println("Printed book '" + getTitle() + "' has been shipped.");
    }

    public double getShippingCost() {
        return weight * 2.4;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", weight = " + weight + "kg" +
                ", hardCover = " + getHardcoverStatus();
    }

    private String getHardcoverStatus() {
        if (hardcover)
            return "This book is hardcover.";
        else
            return "This book isn't hardcover.";
    }
}
