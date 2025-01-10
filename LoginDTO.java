package com.example.ToDoList.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginDTO {
    private String email;
    private String password;

    public String getEmail() {
    return email; }
}
