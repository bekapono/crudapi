package com.crudapi.controller;

import com.crudapi.model.User;
import com.crudapi.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)  // Response output 201.
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PatchMapping("/{id}/username")
    public User updateUserName(@PathVariable Long id, @RequestBody String userName) {
        return userService.updateUserName(id, userName);
    }

    @PatchMapping("/{id}/email")
    public User updateUserEmail(@PathVariable Long id, @RequestBody String email) {
        return userService.updateUserEmail(id, email);
    }

    @PatchMapping("/{id}/firstName")
    public User updateFirstName(@PathVariable Long id, @RequestBody String firstName) {
        return userService.updateFirstName(id, firstName);
    }

    @PatchMapping("/{id}/lastName")
    public User updateLastName(@PathVariable Long id, @RequestBody String lastName) {
        return userService.updateLastName(id, lastName);
    }

    @DeleteMapping("/{id")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userService.softDeleteUserById(id);
        return ResponseEntity.ok("User marked as deleted");
    }
}
