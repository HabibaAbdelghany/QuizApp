package com.example.demo.services;

import com.example.demo.Data.QuestionData;
import com.example.demo.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServices {
    @Autowired
    QuestionData questionData;
    public List<Question> getAllQuestions() {
     return questionData.findAll();

    }



    public List<Question> getQuestionCategory(String category) {
        return questionData.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionData.save(question);
        return "done";
    }
}
