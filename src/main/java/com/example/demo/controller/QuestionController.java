package com.example.demo.controller;

import com.example.demo.Model.Question;
import com.example.demo.Model.QuestionWrapper;
import com.example.demo.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Questions")
public class QuestionController {

  @Autowired
  QuestionServices questionServices;
  @GetMapping("allQuestions")
    public  ResponseEntity<List<Question>> getAllQuestions(){
      return questionServices.getAllQuestions();
  }
  @GetMapping("category/{category}")
  public  ResponseEntity<List<Question>> getAllCategory(@PathVariable String category) {
    return questionServices.getQuestionsByCategory(category);
  }
  @PostMapping("addQuestion")
public ResponseEntity<String> addQuestion(@RequestBody Question question){
return  questionServices.addQuestion(question);}









}
