package problem3.LibraryContent.Document.Types;

import problem3.Library;
import problem3.LibraryContent.Document.Document;

public class Magazine extends Document {

    private String month;
    private int year;

    public Magazine(String title, Library library, String month, int year) {
        super(title, library);
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return "Magazine - " + title + "(" + month + "-" + year + ")";
    }

}
