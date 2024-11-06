package ToDoList;

public class Task {
	 private String title;
	    private String description;
	    private String dueDate;
	    private boolean isComplete;

	    public Task(String title, String description, String dueDate) {
	        this.title = title;
	        this.description = description;
	        this.dueDate = dueDate;
	        this.isComplete = false; // Task is initially not complete
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public String getDueDate() {
	        return dueDate;
	    }

	    public boolean isComplete() {
	        return isComplete;
	    }

	    public void markComplete() {
	        this.isComplete = true;
	    }

	    @Override
	    public String toString() {
	        return title + " -> " + description + " (Due:-> " + dueDate + ") -> " + (isComplete ? "Completed" : "Not Completed");
	    }
	}
