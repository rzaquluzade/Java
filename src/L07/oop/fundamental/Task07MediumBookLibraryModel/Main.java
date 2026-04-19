package L07.oop.fundamental.Task07MediumBookLibraryModel;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Azərbaycan tarixi", "Ziya Bünyadov", true );
        Book b2 = new Book("Dədə qorqud", "Xalq yaradıcılığı (anonim)", false );
        Book b3 = new Book("Fiyuzat", "Əli bəy Hüseynzadə", true );

        Library library = new Library(new Book[] {b1, b2, b3});

        library.listBooks();

        b1.borrow();
        b3.borrow();
        b1.returnBook();

        library.listBooks();

    }
}
