package com.projecthr.hrnew.Service;

import com.projecthr.hrnew.Entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    Task updateTask(Task task);
    Task getTaskById(Long taskId);
    List<Task> getAllTasks();
    void deleteTask(Long taskId);
}
