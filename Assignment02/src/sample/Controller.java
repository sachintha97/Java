package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Label lblLogin;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private GridPane rootPane;

//Action method for opening dashboard window after login window
    @FXML
    public void Login(ActionEvent event) throws IOException {
        try {
            if (txtUserName.getText().equals("admin") && txtPassword.getText().equals("7789")) {
                lblLogin.setText("Login Success");
                Stage secondStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
                secondStage.setTitle("DashBoard System");
                secondStage.setScene(new Scene(root, 900, 550));
                secondStage.show();

            } else {
                lblLogin.setText("Login Fail");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    //Action method for change grid pane after click customer button
    @FXML
    public void CustomerTab(ActionEvent event) throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Customer.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    //Action method for change grid pane after click employee button
    @FXML
    public void EmployeeTab(ActionEvent event) throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    //Action method for change grid pane after click contract button
    @FXML
    public void ContractTab(ActionEvent event) throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Contract.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    //Action method for change grid pane after click role button
    @FXML
    public void RoleTab(ActionEvent event) throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Role.fxml"));
        rootPane.getChildren().setAll(pane);
    }



}



