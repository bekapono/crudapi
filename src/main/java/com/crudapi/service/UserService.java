package com.crudapi.service;

import com.crudapi.model.User;
import com.crudapi.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUserName(Long id, String userName) {
        User user = findUserById(id);
        user.setUserName(userName);
        return userRepository.save(user);
    }

    public User updateUserEmail(Long id, String email) {
        User user = findUserById(id);
        user.setEmail(email);
        return userRepository.save(user);
    }

    public User updateFirstName(Long id, String firstName) {
        User user = findUserById(id);
        user.setFirstName(firstName);
        return userRepository.save(user);
    }

    public User updateLastName(Long id, String lastName) {
        User user = findUserById(id);
        user.setLastName(lastName);
        return userRepository.save(user);
    }
}
