package sample;

import javafx.beans.property.*;

public class Role {
    private IntegerProperty rID;
    private DoubleProperty hourlypay;
    private StringProperty roleType;


    //role constructor class method
    public Role(){

        this.rID = new SimpleIntegerProperty();
        this.hourlypay = new SimpleDoubleProperty();
        this.roleType = new SimpleStringProperty();

    }

    // role id getter and setter methods
    public int getrID(){
        return rID.get();
    }
    public void setrID(int id){
        this.rID.set(id);
    }
    public IntegerProperty getroleid(){
        return rID;
    }


    // role hourlypay getter and setter methods
    public Double getrHourlypay(){
        return hourlypay.get();
    }
    public void setrHourlypay(Double pay){
        this.hourlypay.set(pay);
    }
    public DoubleProperty getRoleHpay(){
        return hourlypay;
    }


    // role role type getter and setter methods
    public String getRoleType(){
        return roleType.get();
    }
    public void setRoleType(String role){
        this.roleType.set(role);
    }
    public StringProperty getR_Type(){
        return roleType;
    }

}
