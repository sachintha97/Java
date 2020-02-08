package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contract {

    private StringProperty contractID;
    private StringProperty contractName;
    private StringProperty creationDate;
    private StringProperty jobType;
    private StringProperty contractDescription;
    private IntegerProperty projectLeaderID;

    //contract constructor class method
    public Contract(){

        this.contractID = new SimpleStringProperty();
        this.contractName = new SimpleStringProperty();
        this.creationDate = new SimpleStringProperty();
        this.jobType = new SimpleStringProperty();
        this.contractDescription = new SimpleStringProperty();
        this.projectLeaderID = new SimpleIntegerProperty();
    }


    // contract id getter and setter methods
    public String getContractID(){
        return contractID.get();
    }
    public void setContractID(String Id){
        this.contractID.set(Id);
    }
    public StringProperty getConId(){
        return contractID;
    }


    // contract name getter and setter methods
    public String getContractName(){
        return contractName.get();
    }
    public void setContractName(String conName){
        this.contractName.set(conName);
    }
    public StringProperty getconName(){
        return contractName;
    }


    // contract creation date getter and setter methods
    public String getCreationDate(){
        return creationDate.get();
    }
    public void setCreationDate(String date){
        this.creationDate.set(date);
    }
    public StringProperty getCdate(){
        return creationDate;
    }


    // job type getter and setter methods
    public String getJobType(){
        return jobType.get();
    }
    public void setJobType(String Type){
        this.jobType.set(Type);
    }
    public StringProperty getJtype(){
        return jobType;
    }

    //contract description getter and setter methods
    public String getcontractDescription(){
        return contractDescription.get();
    }
    public void setcontractDescription(String description){
        this.contractDescription.set(description);
    }
    public StringProperty getConDescription(){
        return contractDescription;
    }


    //project leader id getter and setter methods
    public int getprojectLeaderID(){
        return projectLeaderID.get();
    }

    public void setprojectLeaderID(int pID){
        this.projectLeaderID.set(pID);
    }

    public IntegerProperty getProID(){
        return projectLeaderID;
    }
}
