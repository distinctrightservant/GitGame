package com.example.gitgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private  Button answer1;
    @FXML
    private  Button answer2;
    @FXML
    private  Button answer3;
    @FXML
    private  Button answer4;
    @FXML
    private  Label Question;
    @FXML
    private  Button Submit;
    @FXML
    private  Label percentage;
    @FXML
    private ImageView meme;

    private Button activeButton;
    @FXML
    protected void buttonClicked(ActionEvent button){
        resetColors();
        Button buttonclicked = (Button) button.getSource();
        activeButton = buttonclicked;
        String curQuest = GuiLogic.getQuestion();
        if (curQuest.contains("_")) {
            curQuest = curQuest.replace("_", activeButton.getText());
            Question.setText(curQuest);
        }
        buttonclicked.setStyle("-fx-background-color: #fff");
    }
    @FXML
    protected void submitClicked(ActionEvent button){
        Button submitted = (Button) button.getSource();
        GuiLogic.checkAnswer(activeButton.getText());
        playAround();
    }
    protected void playAround(){
        GuiLogic.Guirunning();
        resetColors();
        Question.setText(GuiLogic.getQuestion());
        answer1.setText(GuiLogic.getAnswer1());
        answer2.setText(GuiLogic.getAnswer2());
        answer3.setText(GuiLogic.getAnswer3());
        answer4.setText(GuiLogic.getAnswer4());
        if(GuiLogic.getPercentage() <0.7){
            percentage.setStyle("-fx-background-color: #FF0000; -fx-text-fill: black; -fx-font-size: 16px;");
        }
        else if(GuiLogic.getPercentage() >= 0.9){
            percentage.setStyle("-fx-background-color: #008000; -fx-text-fill: black; -fx-font-size: 16px;");
        }
        else if(GuiLogic.getPercentage() >0.7 & GuiLogic.getPercentage() <0.8){
            percentage.setStyle("-fx-background-color: #FFA500; -fx-text-fill: black; -fx-font-size: 16px;");
        }
        else{
            percentage.setStyle("-fx-background-color: #0000FF; -fx-text-fill: black; -fx-font-size: 16px;");
        }
    }
   public void initialize(){
        GuiLogic.generateTerms();
        GuiLogic.generateIndex();
        GuiLogic.Guirunning();
        resetColors();
        Question.setText(GuiLogic.getQuestion());
        answer1.setText(GuiLogic.getAnswer1());
        answer2.setText(GuiLogic.getAnswer2());
        answer3.setText(GuiLogic.getAnswer3());
        answer4.setText(GuiLogic.getAnswer4());
        percentage.setStyle("-fx-background-color: #FF0000; -fx-text-fill: black; -fx-font-size: 16px;");

   }
   public void resetColors(){
       answer1.setStyle("-fx-background-color: #d3d3d3; -fx-text-fill: black; -fx-font-size: 16px;");
       answer2.setStyle("-fx-background-color: #d3d3d3; -fx-text-fill: black; -fx-font-size: 16px;");
       answer3.setStyle("-fx-background-color: #d3d3d3; -fx-text-fill: black; -fx-font-size: 16px;");
       answer4.setStyle("-fx-background-color: #d3d3d3; -fx-text-fill: black; -fx-font-size: 16px;");
   }
}