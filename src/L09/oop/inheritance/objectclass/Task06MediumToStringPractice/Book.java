package L09.oop.inheritance.objectclass.Task06MediumToStringPractice;

public class Book {

    private String title;
    private String author;
    private String isbn;

    public Book (String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString () {
        return "Title : " + title + "\nAuthor : " + author + "\nIsbn : " + isbn;
    }
}
