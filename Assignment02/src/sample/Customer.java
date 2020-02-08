package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {

    private StringProperty customerID;
    private StringProperty cName;
    private StringProperty customerEmail;
    private IntegerProperty cTelNum;
    private StringProperty contractID;
    private StringProperty contractID2;


    //customer constructor class method
    public Customer() {

        this.customerID = new SimpleStringProperty();
        this.cName = new SimpleStringProperty();
        this.customerEmail = new SimpleStringProperty();
        this.cTelNum = new SimpleIntegerProperty();
        this.contractID = new SimpleStringProperty();
        this.contractID2 = new SimpleStringProperty();

    }


    // customer id getter and setter methods
    public String getCustomerID() {
        return customerID.get();
    }

    public void setCustomerID(String Id) {
        this.customerID.set(Id);
    }

    public StringProperty getCID() {
        return customerID;
    }


    // customer name getter and setter methods
    public String getCName() {
        return cName.get();
    }

    public void setCName(String Name) {
        this.cName.set(Name);
    }

    public StringProperty getCustomerName() {
        return cName;
    }


    // customer email getter and setter methods
    public String getCustomerEmail() {
        return customerEmail.get();
    }

    public void setCustomerEmail(String email) {
        this.customerEmail.set(email);
    }

    public StringProperty getCemail() {
        return customerEmail;
    }


    //customer telephone number getter and setter methods
    public int getcTelNum(){
        return cTelNum.get();
    }

    public void setcTelNum(int num){
        this.cTelNum.set(num);
    }

    public IntegerProperty getTelNum(){
        return cTelNum;
    }


    // contract id getter and setter methods
    public String getContractID() {
        return contractID.get();
    }

    public void setContractID(String cID) {
        this.contractID.set(cID);
    }

    public StringProperty getconID() {
        return contractID;
    }


    //if more than one contract then second contract getter and setter methods
    public String getContractID2() {
        return contractID2.get();
    }

    public void setContractID2(String cID2) {
        this.contractID2.set(cID2);
    }

    public StringProperty getConID2() {
        return contractID2;
    }

}


