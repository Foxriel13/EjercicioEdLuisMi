package Ejercicio06;

public class Task {
	private int id;
    private String taskText;

    public Task(int id, String taskText) {
        this.id = id;
        this.taskText = taskText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }
}
