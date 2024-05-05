package com.example.HilelTask8;

import com.example.hilel_task_3.Task;

import java.util.List;

import com.example.hilel_task_3.Task;

import java.util.List;

public interface TaskDAO {
    void addTask(Task task);
    Task getTask(int taskId);
    List<Task> getAllTasks();
    void updateTask(Task task);
    void deleteTask(int taskId);
}