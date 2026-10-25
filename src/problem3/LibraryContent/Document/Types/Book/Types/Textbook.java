package problem3.LibraryContent.Document.Types.Book.Types;

import problem3.Library;
import problem3.LibraryContent.Document.Types.Book.Book;

public class Textbook extends Book {

    public String level;

    public Textbook(String title, Library library, String author, int nbrPages, String level) {
        super(title, library, author, nbrPages);
        this.level = level;
    }

}
