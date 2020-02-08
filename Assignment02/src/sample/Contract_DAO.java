package sample;

import java.sql.SQLException;

public class Contract_DAO {

    //insert values to contract table
    public static void AddContract(String contractID, String contractName, String creationDate, String jobType, String contractDescription, int projectLeaderID) throws SQLException, ClassNotFoundException{
        try{
            String sql = "insert into contract(contractID, contractName, creationDate, jobType, contractDescription, projectLeaderID) values('"+contractID+"','"+contractName+"', '"+creationDate+"', '"+jobType+"', '"+contractDescription+"','"+projectLeaderID+"');";
            Connecter.executeQuery(sql);
            System.out.println("Contract Table Insert Complete");
        }
        catch (SQLException e){
            System.out.println("Exception occur while data inserting contract table"+e);
            e.printStackTrace();
            throw e;

        }
    }


    //values update inside contract table
    public static void updateContract(String Id, int projectLeaderID) throws SQLException, ClassNotFoundException{

        try {
            String sql ="update contract set projectLeaderID = '"+projectLeaderID+"' where contractID='"+Id+"'";
            Connecter.executeQuery(sql);
            System.out.println("Contract Table Update Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data updating");
            e.printStackTrace();
            throw e;
        }
    }


    //values delete inside contract table
    public static void deleteContract(String Id) throws SQLException,ClassNotFoundException{
        try {
            String sql2 ="delete from contract where contractID='"+Id+"'";
            Connecter.executeQuery(sql2);
            System.out.println("Contract Table Values Delete Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data deleting + e");
            e.printStackTrace();
            throw e;
        }
    }

}
