import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnecter {
        public static final String DBDriver = "com.mysql.jdbc.Driver";
        public static final String DBUrl = "jdbc:mysql://localhost/vehicle_rental_system_w1714878";
        public static Connection connection = null;
        public static Statement statement = null;
        public static String userName = null;
        public static String userPassword= null;

        // constructor will accept username and password from mysql
        public DatabaseConnecter(String name , String password){
            userName = name;
            userPassword = password;
        }

        // define connection method
        public static void connect() throws SQLException, Exception {
            Class.forName(DBDriver);
            System.out.println("Connecting");
            connection = DriverManager.getConnection(DBUrl, userName, userPassword);
            statement = connection.createStatement();
        }

        //closing the connection and statement
        public static void closeConnection() throws SQLException, Exception{
            statement.close();
            connection.close();
        }

        //closing the connection and statement
        public Statement getStatement(){
            return statement;
        }

        // connection getter method
        public Connection getConnection(){
            return connection;
        }

    public static void executeQuery(String sqlStatement) throws SQLException, Exception{

        try {
            connect();
            statement = connection.createStatement();
            statement.executeUpdate(sqlStatement);

        }
        catch (SQLException e){
            System.out.println("Problem occur in database execute query operation" + e);
            throw e;

        } finally {
            if(statement != null){
                statement.close();
            }
            closeConnection();
        }
    }

}
