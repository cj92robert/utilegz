package com.example.demo;

import javax.persistence.*;

@Entity
public class Qest {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(length = 500)
    private String Question;
    private String Answer;

    public Qest() {
    }

    public Qest(String question, String answer) {
        Question = question;
        Answer = answer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
