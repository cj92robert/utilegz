package com.example.demo;

import javax.persistence.*;

@Entity
public class Qest {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(length = 500)
    private String question;
    private String answer;

    public Qest(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Qest() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
