package problem3.LibraryContent.Document.Types.Book.Types;

import problem3.Library;
import problem3.LibraryContent.Document.Types.Book.Book;

public class Novel extends Book {

    public double price;

    public Novel(String title, Library library, String author, int nbrPages, double price) {
        super(title, library, author, nbrPages);
        this.price = price;
    }

}
