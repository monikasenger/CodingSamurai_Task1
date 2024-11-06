package ToDoList;

import java.util.Scanner;

public class ToDoList_Main {
	
    static Scanner sc= new Scanner(System.in);// scanner
    static ToDoList todo=new ToDoList();//todolist class object
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("\n**********To-Do List Application**********");
	       while (true) {
	    	 
	           System.out.println("\n1. Add Task");
	           System.out.println("2. Mark Task as Complete");
	           System.out.println("3. View Tasks");
	           System.out.println("4. Remove Task");
	           System.out.println("5. Exit");
	           System.out.print("Choose an option: ");
	            int choice = Integer.parseInt(sc.nextLine());
	            switch (choice) {
	                case 1://add task
	                   todo.addTask();
	                    break;
	                case 2://mark the task as completed
	                    todo.markTaskAsComplete();
	                    break;
	                case 3://view all the task
	                    todo.viewTasks();
	                    break;
	                case 4://remove the task
	                    todo.removeTask();
	                    break;
	                case 5://exit 
	                    System.out.println("Exiting the application. Goodbye!!!!!!!");
	                    return;
	                default:
	                    System.out.println("Invalid option.... Please try again!!");
	            }
	        }
	}
}
