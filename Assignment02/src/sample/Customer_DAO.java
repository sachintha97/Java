package sample;

import java.sql.SQLException;

public class Customer_DAO {

    //value inserting to customer table
    public static void AddCustomer(String customerID, String cName, String customerEmail,int cTelNum ,String contractID ,String contractID2) throws SQLException, ClassNotFoundException{
        try{
            String sql = "insert into customer(customerID, cName, customerEmail, cTelNum, contractID, contractID2) values('"+customerID+"','"+cName+"', '"+customerEmail+"', '"+cTelNum+"', '"+contractID+"', '"+contractID2+"');";
            Connecter.executeQuery(sql);
            System.out.println("Customer Table Values Insert Complete");
        }
        catch (SQLException e){
            System.out.println("Exception occur while data inserting customer table"+e);
            e.printStackTrace();
            throw e;

        }
    }


    // update values inside customer table
    public static void updateCustomer(String cId, String cEmail, int cTelNum) throws SQLException, ClassNotFoundException{

        try {
            String sql1 ="update customer set customerEmail = '"+cEmail+"', cTelNum = '"+cTelNum+"' where customerID='"+cId+"'";
            Connecter.executeQuery(sql1);
            System.out.println("Customer Table Update Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data updating" +e);
            e.printStackTrace();
            throw e;
        }
    }


    //delete values inside customer tables
    public static void deleteCustomer(String cId) throws SQLException,ClassNotFoundException{
        try {
            String sql2 ="delete from customer where customerID='"+cId+"'";
            Connecter.executeQuery(sql2);
            System.out.println("Customer Table Values Delete Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data deleting + e");
            e.printStackTrace();
            throw e;
        }
    }

}
