package com.example.gitgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label welcome;

    @FXML
    private Button answer1;
    @FXML
    private Button answer2;
    @FXML
    private Button answer3;
    @FXML
    private Button answer4;
    @FXML
    private Label Question;
    @FXML
    protected Boolean isOne(ActionEvent button){
        Button clicked = (Button) button.getSource();
        return answer1.getText().equals(clicked.getText());
        //return if the button that was clicked was answer 1
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
   public void  initialize(){
        this.Question.setText(GuiLogic.getQuestion());
        this.answer1.setText(GuiLogic.getAnswer1());
        this.answer2.setText(GuiLogic.getAnswer2());
        this.answer3.setText(GuiLogic.getAnswer3());
        this.answer4.setText(GuiLogic.getAnswer4());
   }
}