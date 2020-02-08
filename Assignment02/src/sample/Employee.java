package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {

    private IntegerProperty eid;
    private StringProperty ename;
    private StringProperty eEmail;
    private IntegerProperty eNum;
    private StringProperty eDOB;
    private IntegerProperty rId;
    private IntegerProperty rId2;

    //employee constructor class method
    public Employee(){

        this.eid = new SimpleIntegerProperty();
        this.ename = new SimpleStringProperty();
        this.eEmail = new SimpleStringProperty();
        this.eNum = new SimpleIntegerProperty();
        this.eDOB = new SimpleStringProperty();
        this.rId = new SimpleIntegerProperty();
        this.rId2 = new SimpleIntegerProperty();
    }

    // employee id getter and setter methods
    public int getEid(){
        return eid.get();
    }
    public void setEid(int id){
        this.eid.set(id);
    }
    public IntegerProperty getEmpid(){
        return eid;
    }


    // employee name getter and setter methods
    public String getEname(){
        return ename.get();
    }
    public void setEname(String name){
        this.ename.set(name);
    }
    public StringProperty getEmpName(){
        return ename;
    }


    // employee Email getter and setter methods
    public String getEemail(){
        return eEmail.get();
    }
    public void setEemail(String Email){
        this.eEmail.set(Email);
    }
    public StringProperty getEmpEmail(){
        return eEmail;
    }


    // employee telephone number getter and setter methods
    public int getEnum(){
        return eNum.get();
    }
    public void setEnum(int number){
        this.eNum.set(number);
    }
    public IntegerProperty getEmpNum(){
        return eNum;
    }


    // employee date of birthday getter and setter methods
    public String getEdob(){
        return eDOB.get();
    }
    public void setEdob(String DOB){
        this.eDOB.set(DOB);
    }
    public StringProperty getEmpDOB(){
        return eDOB;
    }

    // employee role id getter and setter methods
    public int getRid(){
        return rId.get();
    }
    public void setRid(int Roleid){
        this.rId.set(Roleid);
    }
    public IntegerProperty getEmpRid(){
        return rId;
    }


    // if employee perform more role, second role id getter and setter methods
    public int getRid2(){
        return rId2.get();
    }

    public void setRid2(int roleid2){
        this.rId2.set(roleid2);
    }

    public IntegerProperty getEmpRid2(){
        return rId2;
    }
}
