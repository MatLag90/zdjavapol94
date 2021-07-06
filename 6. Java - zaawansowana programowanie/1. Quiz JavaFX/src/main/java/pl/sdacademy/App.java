package pl.sdacademy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    private int currentQuestionIndex;
    private int points;
    private QuestionAndAnswer[] questionsAndAnswers = {
            new QuestionAndAnswer("Ile wynosi 3 * 4?", "12"),
            new QuestionAndAnswer("Jakiego koloru jest trawa?", "zielonego"),
            new QuestionAndAnswer("Ile kół ma bicykl?", "2"),
            new QuestionAndAnswer("Ile kół ma monocykl?", "1"),
    };
    private Label lblQuestion;

    @Override
    public void start(Stage stage) {
        TextField txtAnswer = new TextField();
        Button btnConfirm = new Button("Odpowiedz");
        lblQuestion = new Label();
        VBox vBox = new VBox(
                lblQuestion,
                txtAnswer,
                btnConfirm
        );
        Scene scene = new Scene(vBox, 300, 300);
        stage.setScene(scene);
        stage.show();

        btnConfirm.setOnAction(event -> {
            String userAnswer = txtAnswer.getText();
            String correctAnswer = getCorrectAnswer();
            if (userAnswer.equals(correctAnswer)) {
                points++;
            }
            txtAnswer.clear(); // txtAnswer.setText("");
            if (isNotLastQuestion()) {
                currentQuestionIndex++;
                displayQuestion();
            } else {
                lblQuestion.setText("Liczba uzyskanych punktów: " + points);
                btnConfirm.setDisable(true);
            }
        });

        displayQuestion();
    }

    private String getCorrectAnswer() {
        QuestionAndAnswer currentQuestionAndAnswer = questionsAndAnswers[currentQuestionIndex];
        return currentQuestionAndAnswer.getAnswer();
    }

    private boolean isNotLastQuestion() {
        return currentQuestionIndex < questionsAndAnswers.length - 1;
    }

    private void displayQuestion() {
        lblQuestion.setText(getCurrentQuestion());
    }

    private String getCurrentQuestion() {
        QuestionAndAnswer currentQuestionAndAnswer = questionsAndAnswers[currentQuestionIndex];
        return currentQuestionAndAnswer.getQuestion();
    }

    public static void main(String[] args) {
        launch();
    }

}
