package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.sql.SQLException;

public class Employee_Controller {

    //java fxml file ids
    @FXML
    private GridPane rootPane;
    @FXML
    private TextField txteName;
    @FXML
    private TextField txteId;
    @FXML
    private TextField eBday;
    @FXML
    private TextField txteEmail;
    @FXML
    private TextField eTel;
    @FXML
    private TextField txtrId;
    @FXML
    private TextField txtrId2;
    @FXML
    private TextArea result;

    //Table column ids
    @FXML
    private TableColumn<Employee, Integer> coleId;
    @FXML
    private TableColumn<Employee, String> coleName;
    @FXML
    private TableColumn<Employee, String> coleEmail;
    @FXML
    private TableColumn<Employee, Integer> coleTel;
    @FXML
    private TableColumn<Employee, String> coleDOB;
    @FXML
    private TableColumn<Employee, Integer> colrId1;
    @FXML
    private TableColumn<Employee, Integer> colrId2;

    @FXML
    private TableView employeeTable;


    //Back button action method
    @FXML
    public void BackButton(ActionEvent event) throws IOException {
        GridPane pane = FXMLLoader.load(getClass().getResource("Main.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    //action method for value inserting to employee table
    @FXML
    public void AddEmployee(ActionEvent event) throws ClassNotFoundException, SQLException {
        try {
            Employee_DAO.AddEmployee(Integer.parseInt(txteId.getText()), txteName.getText(), txteEmail.getText(), Integer.parseInt(eTel.getText()), eBday.getText(), Integer.parseInt(txtrId.getText()), Integer.parseInt(txtrId2.getText()));
            result.setText("Successfully, value added to database");
        } catch (SQLException e) {
            result.setText("Error occur in adding values");
            System.out.println("Error occur in adding values" + e);
            e.printStackTrace();
            throw e;
        }
    }


    //action method for updating value in employee table
    @FXML
    private void updateEmployee(ActionEvent event) throws SQLException, ClassNotFoundException {

        try {
            Employee_DAO.updateEmployee(Integer.parseInt(txteId.getText()), txteEmail.getText(), Integer.parseInt(eTel.getText()));
            result.setText("Successfully, updating database");
        } catch (SQLException e) {
            result.setText("Error occur while updating the data");
            System.out.println("Error occur in updating the data" + e);
            e.printStackTrace();
            throw e;
        }
    }


    //action method for deleting value from employee table
    @FXML
    private void deleteEmployee(ActionEvent event) throws SQLException, ClassNotFoundException {

        try {
            Employee_DAO.deleteEmployee(Integer.parseInt(txteId.getText()));
            result.setText("Successfully, deleting values");
        } catch (SQLException e) {
            result.setText("Error occur while deleting values");
            System.out.println("Error occur while deleting values");
            e.printStackTrace();
            throw e;
        }
    }

}
