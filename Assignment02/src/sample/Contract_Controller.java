package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.sql.SQLException;

public class Contract_Controller {

    //contract fxml file ids
    @FXML private GridPane rootPane;
    @FXML private TextField contractName;
    @FXML private TextField contractId;
    @FXML private TextField creationDate;
    @FXML private TextField jobType;
    @FXML private TextArea Cdescription;
    @FXML private TextField txteId;
    @FXML private TextArea  contractResult;


    //Back button action method
    @FXML
    public void BackButton(ActionEvent event) throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Main.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    //action method for value inserting to contract table
    @FXML
    public void AddContract(ActionEvent event) throws SQLException, ClassNotFoundException{
        try {
            Contract_DAO.AddContract(contractId.getText(),contractName.getText(),creationDate.getText(),jobType.getText(),Cdescription.getText(),Integer.parseInt(txteId.getText()));
            contractResult.setText("Successfully, value added to database contract table");
        }
        catch (SQLException e){
            contractResult.setText("Exception occur in adding values to contract table");
            e.printStackTrace();
            throw e;
        }

    }


    //action method for updating value in contract table
    @FXML
    private void updateContract (ActionEvent evt) throws SQLException,ClassNotFoundException{

        try {
            Contract_DAO.updateContract(contractId.getText(),Integer.parseInt(txteId.getText()));
            contractResult.setText("Successfully, updating database");
        }
        catch (SQLException e){
            contractResult.setText("Error occur while updating the data");
            System.out.println("Error occur in updating the data"+e);
            e.printStackTrace();
            throw e;
        }
    }


    //action method for deleting value from contract table
    @FXML
    private void deleteContract (ActionEvent event) throws SQLException,ClassNotFoundException{

        try {
            Contract_DAO.deleteContract(contractId.getText());
            contractResult.setText("Successfully, deleting values");
        }
        catch (SQLException e){
            contractId.setText("Error occur while deleting values");
            System.out.println("Error occur while deleting values");
            e.printStackTrace();
            throw e;
        }
    }

}
