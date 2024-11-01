// // src/main/java/com/example/model/User.java
// package com.example.model;

// import javax.persistence.*;
// import java.util.List;

// @Entity
// public class User {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String username;
//     private String password;

//     @OneToMany(mappedBy = "user")
//     private List<LearningPath> learningPaths;

//     // Getters and Setters
// }


// backend/src/main/java/com/example/model/User.java
package com.example.backend.model;

// import javax.persistence.*;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @SuppressWarnings("unused")
    private String role;

    // Getters and setters
}
