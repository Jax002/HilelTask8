package com.example.HilelTask8;

import com.example.hilel_task_3.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TaskDAOImpl implements TaskDAO {
    private Map<Integer, Task> tasks = new HashMap<>();

    @Override
    public void addTask(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    @Override
    public Task getTask(int taskId) {
        return tasks.get(taskId);
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public void updateTask(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    @Override
    public void deleteTask(int taskId) {
        tasks.remove(taskId);
    }
}