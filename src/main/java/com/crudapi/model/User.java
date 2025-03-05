package com.crudapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Pattern(regexp = "^[a-zA-Z0-9]{8,50}$", message = "Password must be 8-50 characters and contain only letters and numbers")
    @Column(nullable = false)
    private String password;

    @Pattern(regexp = "^[a-zA-Z\\s]{1,40}$", message = "First name must be 1-40 characters and contain only letters and spaces")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z\\s]{1,40}$", message = "Last name must be 1-40 characters and contain only letters and spaces")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}
