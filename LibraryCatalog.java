import java.util.Scanner;



public class LibraryCatalog {
    public static void main(String[] args) {
        //make scanner
        Book[] catalog = new Book[5]; // make an array of 5 books
        

        while (true) {
            System.out.println("\nLibrary Catalog");
            System.out.println("Menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for books");
            System.out.println("4. Check out a book");
            System.out.println("5. Check in a book");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            

            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook(Scanner scanner, Book[] catalog, int bookCount) {
        
    }

    private static void displayAllBooks(Book[] catalog, int bookCount) {
        
    }

    private static void searchBooks(Scanner scanner, Book[] catalog, int bookCount) {
        
    }

    private static void checkOutBook(Scanner scanner, Book[] catalog, int bookCount) {
        
    }

    private static void checkInBook(Scanner scanner, Book[] catalog, int bookCount) {
        
    }
}
