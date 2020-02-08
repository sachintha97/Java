package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.sql.SQLException;

public class Customer_Controller {

    //customer fxml file ids
    @FXML private GridPane rootPane;
    @FXML private TextField customerId;
    @FXML private TextField txtName;
    @FXML private TextField txtCEmail;
    @FXML private TextField txtCNum;
    @FXML private TextField txtContractId;
    @FXML private TextField txtContractId2;
    @FXML private TextArea cResult;


    //Back button action method
    @FXML
    public void BackButton(ActionEvent event) throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Main.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    //action method for value inserting to customer table
    @FXML
    public void AddCustomer(ActionEvent event) throws SQLException, ClassNotFoundException{
        try {
            Customer_DAO.AddCustomer(customerId.getText(),txtName.getText(),txtCEmail.getText(),Integer.parseInt(txtCNum.getText()),txtContractId.getText(),txtContractId2.getText());
            cResult.setText("Successfully, value added to database customer table");
        }
        catch (SQLException e){
            cResult.setText("Exception occur in adding values to customer table");
            e.printStackTrace();
            throw e;
        }
    }


    //action method for updating value in customer table
    @FXML
    private void updateCustomer (ActionEvent event) throws SQLException,ClassNotFoundException{

        try {
            Customer_DAO.updateCustomer(customerId.getText(),txtCEmail.getText(),Integer.parseInt(txtCNum.getText()));
            cResult.setText("Successfully, updating database");
        }
        catch (SQLException e){
            cResult.setText("Error occur while updating the data");
            System.out.println("Error occur in updating the data"+e);
            e.printStackTrace();
            throw e;
        }
    }


    //action method for deleting value from customer table
    @FXML
    private void deleteCustomer (ActionEvent event) throws SQLException,ClassNotFoundException{

        try {
            Customer_DAO.deleteCustomer(customerId.getText());
            cResult.setText("Successfully, deleting values");
        }
        catch (SQLException e){
            cResult.setText("Error occur while deleting values");
            System.out.println("Error occur while deleting values");
            e.printStackTrace();
            throw e;
        }
    }

}
