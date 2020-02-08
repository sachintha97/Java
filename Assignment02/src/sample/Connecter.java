package sample;

//import com.sun.rowset.CachedRowSetImpl;
import javax.sql.rowset.CachedRowSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Connecter {
    private static Connection connection = null;
    private static final String DB_Driver="com.mysql.jdbc.Driver";
    private static final String DB_Url = "jdbc:mysql://localhost/computer_consultancy_firm_w1714878";

    //opening the connection
    public static void getConnection() throws SQLException, ClassNotFoundException {

        String userName ="admin";
        String password= "7789";

        try{
            Class.forName(DB_Driver);
        }
        catch (ClassNotFoundException e){
            System.out.println("Not found jdbc driver");
            e.printStackTrace();
            throw e;
        }

        System.out.println("jdbc driver registered");

        //get the connection driver manager
        try {
            connection = DriverManager.getConnection(DB_Url,userName, password);
        }
        catch (SQLException e){
            System.out.println("Connection Failed... "+e);
            throw e;
        }
    }

    // closing the connection
    public static void disconnect() throws SQLException{
        try {
            if(connection != null && !connection.isClosed() ){
                connection.close();
            }
        }
        catch (Exception e){
            throw e;
        }
    }


    //database record insert , delete , update operation
    public static void executeQuery(String sqlStatement) throws SQLException, ClassNotFoundException{
        Statement statement = null;

        try {
            getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(sqlStatement);

        }
        catch (SQLException e){
            System.out.println("Problem occur in database execute query operation" + e);
            throw e;
        }
        finally {
            if(statement != null){
                statement.close();
            }
            disconnect();
        }
    }

    // retrieving the the records from the database
    public  static ResultSet execute(String query) throws ClassNotFoundException, SQLException{
        Statement statement = null;
        ResultSet resultSet = null;
        CachedRowSet crs = null;

        try {
            getConnection();
            connection.createStatement();
            resultSet = statement.executeQuery(query);
            crs.populate(resultSet);
        }
        /*CachedRowSet cachedRowSet= null;

        try {
            getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            //cachedRowSet= new CachedRowSet() ;
            //cachedRowSet.populate(resultSet);
        }*/
        catch (SQLException e){
            System.out.println("Error occur in database Execute" + e);
            throw e;
        }
        finally {
            if(resultSet != null) {
                resultSet.close();
            }
            else if(statement != null){
                statement.close();
            }
            disconnect();
        }
        return resultSet;
    }
}
