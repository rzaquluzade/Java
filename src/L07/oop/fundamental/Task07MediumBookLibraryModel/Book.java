package L07.oop.fundamental.Task07MediumBookLibraryModel;

public class Book {

    private String title;
    private String author;
    private boolean available;

    public Book (String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public void borrow () {
        if (!this.available) {
            System.out.printf("Taken away.");
            return;
        }

        this.available = false;
        System.out.printf("Was taken.");
    }

    public void returnBook () {
        if (this.available) {
            System.out.printf("No debt has been taken.");
            return;
        }

        this.available = true;
        System.out.printf("Loan was given.");
    }

    public void printInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + available);
    }
}
