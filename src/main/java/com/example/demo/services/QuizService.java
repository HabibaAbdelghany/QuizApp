package com.example.demo.services;

import com.example.demo.Data.QuestionData;
import com.example.demo.Data.QuizData;
import com.example.demo.Model.Question;
import com.example.demo.Model.QuestionWrapper;
import com.example.demo.Model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizData quizData;
    @Autowired
QuestionData questionData;
    public  ResponseEntity<String> createQuiz(String category, int numq, String title) {
      List< Question> questions=questionData.findRandomQuestionByCategory(category,numq);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizData.save(quiz);
return  new ResponseEntity<>("success", HttpStatus.CREATED);
    }


    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz =quizData.findById(id);
        List<Question>questionsFromDB =quiz.get().getQuestions();
        List<QuestionWrapper>questionForUser = new ArrayList<>();
for (Question q :questionsFromDB)     {
    QuestionWrapper qw =new QuestionWrapper(q.getId(),q.getTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
}
return  new ResponseEntity<>(questionForUser,HttpStatus.OK);
    }


}
