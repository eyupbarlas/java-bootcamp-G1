import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementSystem {
    private static ArrayList<Task> taskList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    listTasks();
                    break;
                case 2:
                    addTask();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    System.out.println("Exiting Task Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nTask Management System Menu:");
        System.out.println("1. List Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void listTasks() {
        System.out.println("\nTask List:");
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : taskList) {
                System.out.println(task);
            }
        }
    }

    private static void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();

        taskList.add(new Task(description));
        System.out.println("Task added successfully!");
    }

    private static void markTaskAsCompleted() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the task number to mark as completed: ");
        int taskNumber = scanner.nextInt();

        if (taskNumber >= 1 && taskNumber <= taskList.size()) {
            Task task = taskList.get(taskNumber - 1);
            task.setCompleted(true);
            System.out.println("Task marked as completed: " + task.getDescription());
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }
}

class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Task: " + description + " (" + (isCompleted ? "Completed" : "Pending") + ")";
    }
}
