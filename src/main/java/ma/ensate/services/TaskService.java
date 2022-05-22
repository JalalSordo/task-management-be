package ma.ensate.services;

import ma.ensate.entities.Task;

import java.util.List;

public interface TaskService {


    List<Task> getAllTasks();

    Task addTask(Task task);

    Task updateTask(Task task);

    void deleteTask(Long taskId);
}
