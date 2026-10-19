package com.todo.TODOL.repository;


import com.todo.TODOL.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
