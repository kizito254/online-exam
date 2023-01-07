import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExamProgram extends Application {

  private Exam exam;
  private int currentQuestionIndex = 0;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    // Create the exam
    exam = new Exam("Java Exam", "John Doe");
    exam.addQuestion(new MultipleChoiceQuestion("What is the capital of France?",
                                                 "Paris", "Marseille", "Lyon", "Bordeaux",
                                                 'A'));
    exam.addQuestion(new MultipleChoiceQuestion("What is the capital of Italy?",
                                                 "Rome", "Milan", "Naples", "Turin",
                                                 'A'));
    exam.addQuestion(new MultipleChoiceQuestion("What is the capital of Spain?",
                                                 "Barcelona", "Madrid", "Seville", "Valencia",
                                                 'B'));

    // Create the UI
    Label examLabel = new Label(exam.getName());
    Label questionLabel = new Label(exam.getQuestion(currentQuestionIndex).getText());
    ToggleGroup answerGroup = new ToggleGroup();
    RadioButton answerA = new RadioButton("A");
    answerA.setToggleGroup(answerGroup);
