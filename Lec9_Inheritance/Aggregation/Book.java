package Lec9_Inheritance.Aggregation;

public class Book {

    private String BookID;
    private String title;
    private Author author;

    public Book(String BookID, String title, Author author) {
        this.BookID = BookID;
        this.title = title;
        this.author = author;
    }

    public Book() {

    }

    public String getBookID() {
        return BookID;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book {" + "BookID = " + BookID + " | " + "Title = " + title +
                " | " + "Author = " + author + "}";
    }
}
