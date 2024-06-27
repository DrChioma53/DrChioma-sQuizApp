package com.cs4md.drchioma_squizapp;

public class Question {

    // instance variables
    String questionText;
    boolean questionCorrectAnswer;

    // constructor
    public Question(String questionText, boolean questionCorrectAnswer) {
        this.questionText = questionText;
        this.questionCorrectAnswer = questionCorrectAnswer;
    }

    // getters and setters
    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String newQuestionText) {
        this.questionText = newQuestionText;
    }
    public boolean getQuestionCorrectAnswer() {
        return questionCorrectAnswer;
    }
    public void setQuestionCorrectAnswer(boolean newCorrectAnswer) {
        this.questionCorrectAnswer = newCorrectAnswer;
    }

}