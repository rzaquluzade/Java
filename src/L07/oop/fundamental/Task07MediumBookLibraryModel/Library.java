package L07.oop.fundamental.Task07MediumBookLibraryModel;

public class Library {

    private Book[] books;

    public Library (Book[] books) {
        this.books = books;
    }

    public void listBooks () {
        System.out.println("Library Books :");
        for (Book b : books) {
            b.printInfo();
        }
    }
}
