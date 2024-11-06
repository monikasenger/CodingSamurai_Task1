package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	 static ArrayList<Task> tasks= new ArrayList<>();
	    static Scanner sc= new Scanner(System.in);

	    // Add a new task to the list method
	    public static void addTask() {
	        System.out.println("\nEnter task title: ");
	        String title = sc.nextLine();
	        System.out.println("Enter task description: ");
	        String description = sc.nextLine();
	        System.out.println("Enter task due date (YYYY-MM-DD): ");
	        String dueDate = sc.nextLine();
	        tasks.add(new Task(title, description, dueDate));
	        System.out.println("Task added successfully......");
	    }

	    // Mark a task as complete method
	    public static void markTaskAsComplete() {
	        viewTasks();
	        System.out.println("\nEnter the index of the task to mark as complete: ");
	        int index = Integer.parseInt(sc.nextLine());
	        if (index >= 0 && index < tasks.size()) {
	            tasks.get(index).markComplete();
	            System.out.println("Task marked as complete.....");
	        } else {
	            System.out.println("Invalid index.... Please try again!!!!");
	        }
	    }

	    // View all tasks method
	    public static void viewTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("\nNo tasks available.....");
	        } else {
	            System.out.println("Tasks:");
	            for (int i = 0; i < tasks.size(); i++) {
	                System.out.println(i + ").  " + tasks.get(i));
	            }
	        }
	    }

	    // Remove a task from the list method
	    public static void removeTask() {
	        viewTasks();
	        System.out.println("\nEnter the index of the task to remove: ");
	        int index = Integer.parseInt(sc.nextLine());
	        if (index >= 0 && index < tasks.size()) {
	            tasks.remove(index);
	            System.out.println("Task removed successfully.....");
	        } else {
	            System.out.println("Invalid index..... Please try again!!!!1");
	        }
	    }
}