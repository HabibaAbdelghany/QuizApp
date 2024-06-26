package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String diffucltLevel;
    private String rightAnswer;
    private String category;


}
