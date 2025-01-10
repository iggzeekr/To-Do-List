package com.example.ToDoList.dto;

import com.example.ToDoList.models.Priority;
import com.example.ToDoList.models.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String completedDate;
    private String status;
    private LoginDTO user;
    private String categoryId;
    private Priority priority;

    public boolean isCompleted() {
        return false;
    }
    // Getters and Setters
}