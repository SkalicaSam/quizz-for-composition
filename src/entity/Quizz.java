package entity;

import java.util.ArrayList;
import java.util.List;

public class Quizz {
    public List<Question> questions;

    public Quizz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

}
