package com.atbug.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    public record User(String name, String email) {
    }

    private final List<User> users = new ArrayList<>(List.of(new User("John", "john@example.com"), new User("Jane", "jane@example.com")));

    /**
     * Get all users
     *
     * @return list of users
     */
    @GetMapping("/users")
    public List<User> getUsers() {
        return users;
    }

    /**
     * Add a new user
     *
     * @param user user to add
     * @return success message
     */
    @PostMapping("/users")
    public String addUser(User user) {
        users.add(user);
        return "User added successfully!";
    }
}
