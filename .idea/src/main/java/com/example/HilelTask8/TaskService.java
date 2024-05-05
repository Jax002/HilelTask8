package com.example.HilelTask8;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task getTask(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null;
    }

    public void assignTask(int taskId, String username, UserService userService) {
        Task task = getTask(taskId);
        if (task != null) {
            User user = userService.getUser(username);
            if (user != null) {
                user.assignTask(task);
            }
        }
    }

    public List<Task> findTasksByStatus(TaskStatus status) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getTaskStatus() == status) {
                result.add(task);
            }
        }
        return result;
    }
}