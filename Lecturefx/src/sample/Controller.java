package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML private TextField txtNum1;
    @FXML private TextField txtNum2;
    @FXML private TextField txtNum3;
    @FXML private Button btnFindMax;

    @FXML
    public void findMax(ActionEvent evt){
        //find maximum number implementation

        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        int num3 = Integer.parseInt(txtNum3.getText());

        int max = Math.max(Math.max(num1,num2),num3);
        Alert message = new Alert(Alert.AlertType.INFORMATION,"Maximum number:" + String.valueOf(max));
        message.showAndWait();

    }
}
