// // src/main/java/com/example/model/LearningPath.java
// package com.example.backend.model;

// // import javax.persistence.*;
// import java.util.List;
// import jakarta.persistence.*;


// @Entity
// public class LearningPath {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String title;
//     private String description;

//     @ManyToOne
//     private User user;

//     @OneToMany(mappedBy = "learningPath")
//     private List<LearningPath> resources;

//     // Getters and Setters
// }


// backend/src/main/java/com/example/model/LearningPath.java
package com.example.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "learning_paths")
public class LearningPath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and setters
}
