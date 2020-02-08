package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class Controller {
    @FXML private Button btnOne;
    @FXML private Button btnTwo;
    @FXML private Button btnThree;
    @FXML private Button btnFour;
    @FXML private Button btnFive;
    @FXML private Button btnSix;
    @FXML private Button btnSeven;
    @FXML private Button btnEight;
    @FXML private Button btnNine;
    @FXML private Button btnAdd;
    @FXML private Button btnZero;
    @FXML private Button btnEqual;
    int num1,num2,total;


    @FXML public void btnTwoFunction(ActionEvent evt){
        txtDisplay
    }

    @FXML public void btnAddFunction (ActionEvent evt){
        num1= Integer.parseInt(txtDisplay.getText());
        System.out.println("number 1"+ num1);
        txtDisplay.setText("");
    }
}
