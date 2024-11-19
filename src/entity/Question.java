package entity;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String questionText;
    private List<Option> options;
    private  String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.options = new ArrayList<>();
        this.correctAnswer = correctAnswer;
    }

    public void printQuestionForUser(){
        System.out.println(questionText);
        for (Option option: options){
            System.out.println(option.getOptionChar() + ": " + option.getSentence());
        }
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

}
