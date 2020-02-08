package sample;

import java.sql.SQLException;

public class Role_DAO {

    //insert values to role table
    public static void AddRole(int rId, double hourlyPay, String roleType) throws SQLException, ClassNotFoundException{
        try{
            String sql = "insert into role(rId, hourlyPay, roleType) values('"+rId+"','"+hourlyPay+"', '"+roleType+"');";

            Connecter.executeQuery(sql);
            System.out.println("Role Table Values Insert Complete");
        }
        catch (SQLException e){
            System.out.println("Exception occur while data inserting"+e);
            e.printStackTrace();
            throw e;

        }
    }

    // update values inside role table
    public static void updateRole(int Id, double hourlypay) throws SQLException, ClassNotFoundException{

        try {
            String sql1 ="update role set hourlypay= '"+hourlypay+"' where rID='"+Id+"'";
            Connecter.executeQuery(sql1);
            System.out.println("Role Table Update Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data updating" +e);
            e.printStackTrace();
            throw e;
        }
    }


    //delete values inside role table
    public static void deleteRole(int Id) throws SQLException,ClassNotFoundException{
        try {
            String sql2 ="delete from role where rID='"+Id+"'";
            Connecter.executeQuery(sql2);
            System.out.println("Role Table Values Delete Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data deleting + e");
            e.printStackTrace();
            throw e;
        }
    }

}
