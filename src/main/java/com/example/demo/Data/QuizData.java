package com.example.demo.Data;

import com.example.demo.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizData extends JpaRepository<Quiz,Integer> {
}
