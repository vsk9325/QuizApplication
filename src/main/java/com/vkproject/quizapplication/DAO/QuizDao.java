package com.vkproject.quizapplication.DAO;

import com.vkproject.quizapplication.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
