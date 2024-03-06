package service;

import data.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementSystem {
    private static final ArrayList<Task> taskList = new ArrayList<>();

    public static void displayMenu() {
        System.out.println("\nTask Management System Menu:");
        System.out.println("1. List Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Check Overdue Tasks");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void listTasks() {
        System.out.println("\nTask List:");
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : taskList) {
                System.out.println(task);
            }
        }
    }

    public static void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();

        String dueDate = LocalDateTime.now().toString();

        taskList.add(new Task(description, dueDate));
        System.out.println("Task added successfully!");
    }

    public static void markTaskAsCompleted() {
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

    public static void checkOverdueTasks() {
        // implement checkOverdueTasks logic
        System.out.println("task is complete");
    }
}
