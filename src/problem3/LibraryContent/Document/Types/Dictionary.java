package problem3.LibraryContent.Document.Types;

import problem3.Library;
import problem3.LibraryContent.Document.Document;

public class Dictionary extends Document {

    private String language;

    public Dictionary(String title, Library library, String language) {
        super(title, library);
        this.language = language;
    }

    public String toString() {
        return "Dictionary - " + title + " (" + language + ")";
    }
}
