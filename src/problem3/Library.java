package problem3;

import problem3.LibraryContent.Document.Document;
import problem3.LibraryContent.Document.Types.Book.Book;

import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        documents = new ArrayList<>();
    }

    public void displayDocuments() {
        System.out.println(this);
    }

    public boolean add(Document doc) {
        if (documents.size() < capacity) {
            documents.add(doc);
            return true;
        }
        return false;
    }

    public boolean delete(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numEnrg) {
        for (Document d : documents) {
            if (d.getId() == numEnrg) {
                return d;
            }
        }
        return null;
    }

    public void displayAuthors() {
        System.out.println("================= Authors ================");
        for (Document doc : documents) {
            if (doc instanceof Book) {
                System.out.println(((Book) doc).getAuthor());
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n=============== Library ===============\n");
        for (Document doc : documents) {
            sb.append(doc).append("\n");
        }

        return sb.toString();
        //TODO: DO THE OTHER TOSTRINGS
    }

}
