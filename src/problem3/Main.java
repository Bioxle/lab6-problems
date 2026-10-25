package problem3;

import problem3.LibraryContent.Document.Document;
import problem3.LibraryContent.Document.Types.Book.Types.Novel;
import problem3.LibraryContent.Document.Types.Magazine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum capacity (n) of the library: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Library library = new Library(n);

        Document doc1 = new Novel("The Great Gatsby", library, "F. Scott Fitzgerald", 218, 15.99);
        Document doc2 = new Magazine("National Geographic", library, "October", 2026);

        library.add(doc1);
        library.add(doc2);

        System.out.println("Library initialized with 2 default documents.");

        int choice = -1;

        while (choice != 0) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add a Document");
            System.out.println("2. Display all Documents");
            System.out.println("3. Delete a Document");
            System.out.println("4. Find a Document by Record Number");
            System.out.println("5. Display all Authors");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title of the new novel: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter number of pages: ");
                    int pages = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    Document newDoc = new Novel(title, library, author, pages, price);
                    if (library.add(newDoc)) {
                        System.out.println("Document added successfully.");
                    } else {
                        System.out.println("Failed to add document (Library might be full).");
                    }
                    break;
                case 2:
                    System.out.println("\n--- All Documents ---");
                    library.displayDocuments();
                    break;
                case 3:
                    System.out.print("Enter the record number (numEnreg) to delete: ");
                    int idToDelete = scanner.nextInt();
                    Document docToDelete = library.document(idToDelete);

                    if (docToDelete != null && library.delete(docToDelete)) {
                        System.out.println("Document deleted successfully.");
                    } else {
                        System.out.println("Document not found or could not be deleted.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the record number (numEnreg) to search: ");
                    int searchId = scanner.nextInt();
                    Document foundDoc = library.document(searchId);

                    if (foundDoc != null) {
                        System.out.println("Found: " + foundDoc.toString());
                    } else {
                        System.out.println("No document found with that record number.");
                    }
                    break;
                case 5:
                    System.out.println("\n--- Authors List ---");
                    library.displayAuthors();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}