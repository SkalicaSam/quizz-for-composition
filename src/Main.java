import entity.Option;
import entity.Question;
import entity.Quizz;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quizz quizz1 = new Quizz();

        Question question1 = new Question("Ake je hlavné mesto Slovenska?", "a");
        Option option1 = new Option("a", "Bratislava");
        Option option2 = new Option("b", "Varšava");
        question1.addOption(option1);
        question1.addOption(option2);
        quizz1.addQuestion(question1);

        Question question2 = new Question("Ktorý oceán je najväčší?", "b");
        question2.addOption(new Option("a", "Atlantický oceán"));
        question2.addOption(new Option("b", "Tichý oceán"));
        question2.addOption(new Option("c", "Indický oceán"));
        quizz1.addQuestion(question2);

        Question question3 = new Question("Koľko hráčov je v tíme v basketbale?", "b");
        question3.addOption(new Option("a", "7"));
        question3.addOption(new Option("b", "5"));
        question3.addOption(new Option("c", "6"));
        quizz1.addQuestion(question3);

        Scanner scanner = new Scanner(System.in);
        int userScore = 0;

        for (Question question : quizz1.questions) {
            question.printQuestionForUser();
            String userAnswered = scanner.next();
            if (Objects.equals(userAnswered, question.getCorrectAnswer())) {
                System.out.println("Zadal si správnu odpoveď!");
                userScore++;
            } else {
                System.out.println("Nesprávna odpoveď");
            }
        }
        System.out.println("Správne si odpovedal na: " + userScore + " otázky");

    }
}