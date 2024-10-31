// src/main/java/com/example/model/LearningPath.java
package com.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class LearningPath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "learningPath")
    private List<LearningResource> resources;

    // Getters and Setters
}
