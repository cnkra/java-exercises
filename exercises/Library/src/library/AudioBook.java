package library;

import javax.crypto.spec.PSource;

public class AudioBook extends Book {
    private String narrator;
    private double durationInMinutes;

    public AudioBook (String title, String author, int pages, String narrator, double durationInMinutes) {
        super(title, author, pages);
        this.narrator = narrator;
        this.durationInMinutes = durationInMinutes;
    }

    public void play() {
        System.out.println("Playing audiobook '" + getTitle() + "' narrated by " + narrator + "...");
    }

    @Override
    public String toString() {
        return super.toString() + " narrator = " + getNarrator() + ", duration = " + getDurationInMinutes();
    }

    public String getNarrator() {
        return narrator;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }
}
