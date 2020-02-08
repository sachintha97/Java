package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML private TextField textUserName;
    @FXML private TextField textPassword;
    @FXML private Button btnLogin;
    public static String userGreeting;

    @FXML public void login(ActionEvent evt){
        String username = textUserName.getText().trim();
        String password = textPassword.getText().trim();

        if(username.equals("admin")&& password.equals("123")){
            try{
                userGreeting=username;
                //get the rootNode of the second GUI
                Parent rootNode = FXMLLoader.load(getClass().getResource("ControllerMainScreen.fxml"));
                Scene sceneMainScreen = new Scene(rootNode,300,275);
                Stage stageMainScreen =new Stage();
                stageMainScreen.setTitle("Student Registration System");
                stageMainScreen.setScene(sceneMainScreen);
                stageMainScreen.showAndWait();

            }
            catch ()
        }
    }
}
