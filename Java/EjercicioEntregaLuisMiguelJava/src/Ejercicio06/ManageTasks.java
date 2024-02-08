package Ejercicio06;

import java.util.List;

public interface ManageTasks {
	int addTask(String taskText);
    void removeTask(int id);
    void updateTask(Task task);
    Task searchTask(int id);
    List<Task> showTasks();
}
