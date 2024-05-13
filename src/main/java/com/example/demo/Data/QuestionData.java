package com.example.demo.Data;

import com.example.demo.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionData extends JpaRepository<Question,Integer> {
   List<Question> findByCategory(String category);

}

