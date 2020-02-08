package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.sql.SQLException;

public class Role_Controller {
    //role fxml file ids
    @FXML private GridPane rootPane;
    @FXML private TextField txtrId;
    @FXML private TextField txtpay;
    @FXML private TextField txtrole;
    @FXML private TextArea roleresult;


    //Back button action method
    @FXML
    public void BackButton(ActionEvent event) throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Main.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    //action method for value inserting to role table
    @FXML
    public void AddRole(ActionEvent event) throws SQLException, ClassNotFoundException{
        try {
            Role_DAO.AddRole(Integer.parseInt(txtrId.getText()),Double.parseDouble(txtpay.getText()),txtrole.getText() );
            roleresult.setText("Successfully, value added to database role table");
        }
        catch (SQLException e){
            roleresult.setText("Exception occur in adding values to role table");
            e.printStackTrace();
            throw e;
        }

    }


    //action method for updating value in role table
    @FXML
    private void updateRole(ActionEvent event) throws SQLException,ClassNotFoundException{

        try {
            Role_DAO.updateRole(Integer.parseInt(txtrId.getText()),Double.parseDouble(txtpay.getText()));
            roleresult.setText("Successfully, updating database");
        }
        catch (SQLException e){
            roleresult.setText("Error occur while updating the data");
            System.out.println("Error occur in updating the data"+e);
            e.printStackTrace();
            throw e;
        }
    }


    //action method for deleting value from role table
    @FXML
    private void deleteRole(ActionEvent event) throws SQLException,ClassNotFoundException{

        try {
            Role_DAO.deleteRole(Integer.parseInt(txtrId.getText()));
            roleresult.setText("Successfully, deleting values");
        }
        catch (SQLException e){
            roleresult.setText("Error occur while deleting values");
            System.out.println("Error occur while deleting values");
            e.printStackTrace();
            throw e;
        }
    }

}
