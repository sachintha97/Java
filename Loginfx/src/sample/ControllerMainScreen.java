package sample;

import javafx.fxml.FXML;

import java.awt.*;

public class ControllerMainScreen {
    @FXML private Label lblGreeting;


    public void initialize(){
        lblGreeting.setText("Hi,"+Controller.userGreeting);
    }
}
