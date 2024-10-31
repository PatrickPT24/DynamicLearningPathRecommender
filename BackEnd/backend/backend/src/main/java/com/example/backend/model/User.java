// src/main/java/com/example/model/User.java
package com.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<LearningPath> learningPaths;

    // Getters and Setters
}
