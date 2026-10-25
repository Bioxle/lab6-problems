package problem3.LibraryContent.Document;

import problem3.Library;

public class Document {

    protected static int numRec = 0;
    protected String title;
    protected int id;

    private Library library;

    public Document(String title, Library library) {
        this.title = title;
        this.id = numRec++;
        this.library = library;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return title;
    }

}
