package problem3.LibraryContent.Document.Types.Book;


import problem3.Library;
import problem3.LibraryContent.Document.Document;

public class Book extends Document {

    protected String author;
    protected int nbrPages;

    public Book(String title, Library library, String author, int nbrPages) {
        super(title, library);
        this.author = author;
        this.nbrPages = nbrPages;
    }

    public String toString() {
        return "Book - " + title + " (" + author + ") " + nbrPages;
    }

    public String getAuthor() {
        return author;
    }

}
