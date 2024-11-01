// src/main/java/com/example/service/LearningPathService.java
package com.example.service;

import com.example.backend.model.LearningPath;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningPathService {

    @Autowired
    private UserRepository learningPathRepository;

    public List<LearningPath> getAllLearningPathsForUser(Long userId) {
        return learningPathRepository.findByUserId(userId);
    }

    public LearningPath saveLearningPath(LearningPath learningPath) {
        return learningPathRepository.save(learningPath);
    }
}
