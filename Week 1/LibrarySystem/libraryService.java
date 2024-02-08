import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private static ArrayList<Book> libraryBooks = new ArrayList<>();

    public static void main(String[] args) {
        initializeLibrary();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listAllBooks();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    addNewBook();
                    break;
                case 5:
                    System.out.println("Exiting Library System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeLibrary() {
        libraryBooks.add(new Book("Java Fundamentals", "John Doe"));
        libraryBooks.add(new Book("Object-Oriented Programming", "Jane Smith"));
        // Add more initial books as needed
    }

    private static void displayMenu() {
        System.out.println("\nLibrary Management System Menu:");
        System.out.println("1. List All Books");
        System.out.println("2. Borrow a Book");
        System.out.println("3. Return a Book");
        System.out.println("4. Add a New Book");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void listAllBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : libraryBooks) {
            System.out.println(book);
        }
    }

    private static void borrowBook() {
        // Task 4: Implement the logic to allow a user to borrow a book.
        // - Ask the user for the book title they want to borrow.
        // - Check if the book is available in the library.
        // - If available, mark the book as borrowed and display a success message.
        // - If not available, display a message indicating the book is not in the library.
        // - Ensure proper error handling and user input validation.
        // - Update the listAllBooks() method to display the book status (available/borrowed).
    }

    private static void returnBook() {
        // Task 5: Implement the logic to allow a user to return a borrowed book.
        // - Ask the user for the book title they want to return.
        // - Check if the book is currently borrowed.
        // - If borrowed, mark the book as returned and display a success message.
        // - If not borrowed, display a message indicating the book is not currently borrowed.
        // - Ensure proper error handling and user input validation.
        // - Update the listAllBooks() method to display the book status (available/borrowed).
    }

    private static void addNewBook() {
        // Task 6: Implement the logic to allow the librarian to add a new book to the library.
        // - Ask the librarian for the new book title and author.
        // - Add the new book to the libraryBooks ArrayList.
        // - Display a success message after adding the new book.
        // - Ensure proper error handling and user input validation.
        // - Update the listAllBooks() method to display the newly added book.
    }
}

class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + (isBorrowed ? "Borrowed" : "Available") + ")";
    }
}
