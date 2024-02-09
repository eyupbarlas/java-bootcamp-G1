import java.util.Scanner;

import static service.LibrarySystem.*;

public class Main {
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
}