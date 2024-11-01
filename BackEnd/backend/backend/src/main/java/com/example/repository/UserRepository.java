// src/main/java/com/example/repository/UserRepository.java
package com.example.repository;

import com.example.backend.model.LearningPath;
import com.example.backend.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    List<LearningPath> findByUserId(Long userId);

    LearningPath save(LearningPath learningPath);
}
