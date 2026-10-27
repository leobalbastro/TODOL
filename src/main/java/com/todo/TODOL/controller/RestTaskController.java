package com.todo.TODOL.controller;

import com.todo.TODOL.entities.Task;
import com.todo.TODOL.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestTaskController {
    private final TaskService taskService;

    public RestTaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    @RequestMapping ("/getTasks")
    public List<Task> getTasks(){

        return taskService.getAllTasks();
    }

    @PostMapping
    @RequestMapping ("/postTasks")
    public String createTask(@RequestBody Task newTask){
        taskService.createTask(newTask);
        return "{success: true, message: 'La tarea se ha creado correctamente'}";
    }
    @GetMapping("/{id}/delete")
    @RequestMapping ("/deleteTasks")
    public String deleteTasks(@PathVariable Long id){
        taskService.deleteTask(id);
        return "{success: true, message: 'La tarea se ha borrado correctamente'}";

    }
    @GetMapping("/{id}/toggle")
    @RequestMapping ("/toggleTasks")
    public void toggleTask(@PathVariable Long id){
        taskService.toggleTask(id);
    }
}
