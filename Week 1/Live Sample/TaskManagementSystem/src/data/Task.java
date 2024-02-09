package data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String description;
    private boolean isCompleted;
    private String dueDate;

    public Task(String description, String dueDate) {
        this.description = description;
        this.isCompleted = false;
        this.dueDate = dueDate;
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isOverdue() {
        if (dueDate == null || dueDate.trim().isEmpty()) {
            // If no due date is set, consider the task not overdue
            return false;
        }

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dueDateParsed = LocalDateTime.parse(dueDate, formatter);

        // Check if the current date is after the due date
        return currentDate.isAfter(dueDateParsed);
    }

    @Override
    public String toString() {
        return "Task: " + description + " (Due: " + dueDate + ", " + (isCompleted ? "Completed" : "Pending") + ")";
    }
}