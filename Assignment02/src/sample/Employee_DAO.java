package sample;


import java.sql.SQLException;


public class Employee_DAO {

    // insert values to employee table
    public static void AddEmployee(int Id, String Name , String Email, int TelNum ,String DOB ,int rId ,int rId2) throws SQLException, ClassNotFoundException{
        try{
            String sql = "insert into employee(eID, eName, eEmail, eTelNum, eDOB, rID , rId2) values('"+Id+"','"+Name+"', '"+Email+"', '"+TelNum+"', '"+DOB+"', '"+rId+"', '"+rId2+"');";
            Connecter.executeQuery(sql);
            System.out.println("Employee Values Insert Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data inserting"+e);
            e.printStackTrace();
            throw e;

        }
    }


    // update values inside employee table
    public static void updateEmployee(int Id, String Email, int TelNum) throws SQLException, ClassNotFoundException{

        try {
            String sql1 ="update employee set eEmail = '"+Email+"', eTelNum = '"+TelNum+"' where eID='"+Id+"'";
            Connecter.executeQuery(sql1);
            System.out.println("Employee Table Update Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data updating" +e);
            e.printStackTrace();
            throw e;
        }
    }


    //delete values inside employee tables
    public static void deleteEmployee(int Id) throws SQLException,ClassNotFoundException{
        try {
            String sql2 ="delete from employee where eID='"+Id+"'";
            Connecter.executeQuery(sql2);
            System.out.println("Employee Table Values Delete Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data deleting + e");
            e.printStackTrace();
            throw e;
        }
    }


}
