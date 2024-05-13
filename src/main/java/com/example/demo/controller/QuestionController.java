package com.example.demo.controller;

import com.example.demo.Question;
import com.example.demo.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("Questions")
public class QuestionController {

  @Autowired
  QuestionServices questionServices;
  @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
      return questionServices.getAllQuestions();
  }
  @GetMapping("category/{category}")
  public List<Question> getAllCategory(@PathVariable String category) {
    return questionServices.getQuestionCategory(category);
  }
  @PostMapping("addQuestion")
public String addQuestion(@RequestBody Question question){
return  questionServices.addQuestion(question);

}








}
