import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        addVehicle();
    }

    // inserting values to vehicle table
    public static void addVehicle() {

            DatabaseConnecter database = new DatabaseConnecter("root", "");
            Scanner scan2 = new Scanner(System.in);

            System.out.print("Enter plate Number : ");
            String plateNum = scan2.next();

            System.out.print("Enter make : ");
            String make = scan2.next();

            System.out.print("Vehicle Type (car / motorbike) :");
            String type = scan2.next();

            System.out.print("Enter engine capacity : ");
            float engine = scan2.nextFloat();

            System.out.print("Enter rate : ");
            BigDecimal rate = scan2.nextBigDecimal();

            System.out.print("Enter fuel type : ");
            String fuel = scan2.next();

            System.out.print("Number of seats in vehicle : ");
            int seats = scan2.nextInt();

            System.out.print("Is Vehicle available : ");
            String Isavailable = scan2.next();

            boolean available = false;
            if (Isavailable.equals("y"))
                available = true;
            else if (Isavailable.equals("n") )
                available = false;
            else
                System.out.println("enter yes or no");

            switch (type) {
                case "car":
                    System.out.print("Num of Doors : ");
                    int door = scan2.nextInt();

                    System.out.print("Num of Air bags : ");
                    int airBag = scan2.nextInt();
                    try {

                        String sql = "insert into vehicles(plateNumber,make,vehicleType,engineCapacity,rate,fuelType,numOfSeats,vehicleAvailability) values('" + plateNum + "','" + make + "', '" + type + "', '" + engine + "', '" + rate + "','" + fuel + "','" + seats + "','" + available + "');";
                        database.executeQuery(sql);
                        System.out.println("vehicles Table Insert Complete");
                    } catch (SQLException e) {
                        System.out.println("Exception occur while data inserting vehicles table" + e);
                        e.printStackTrace();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "motorbike":
                    System.out.print("Has storage component : ");
                    boolean storage = scan2.nextBoolean();

                    System.out.print("Has side car : ");
                    boolean sideCar = scan2.nextBoolean();
                    break;
            }
        }



    // delete value inside vehicle table
    public static void deleteVehicle(Vehicle vehicle) throws SQLException,Exception{
        try {
            String sql2 ="delete from vehicles where plateNumber='"+vehicle.getPlateNumber()+"'";
            DatabaseConnecter.executeQuery(sql2);
            System.out.println("Vehicle Table Values Delete Complete");
        }
        catch (SQLException e){
            System.out.println("Error occur while data deleting + e");
            e.printStackTrace();
            throw e;
        }
    }

    // print the list of the vehicles in the system
        public static void printVehicleList() {
            DatabaseConnecter database = new DatabaseConnecter("root", "");
            String sql = "SELECT * FROM `vehicles`"; //sql query

            try {
                database.connect();
                ResultSet resultSet = database.getStatement().executeQuery(sql);

                while (resultSet.next()) {
                    String plateNumber = resultSet.getString("plateNumber");
                    String make = resultSet.getString("make");
                    String vehicleType = resultSet.getString("vehicleType");
                    float engineCapacity = resultSet.getFloat("engineCapacity");
                    BigDecimal rate = resultSet.getBigDecimal("rate");
                    String fuelType = resultSet.getString("fuelType");
                    int numOfSeats = resultSet.getInt("numOfSeats");
                    boolean vehicleAvailability = resultSet.getBoolean("vehicleAvailability");

                    System.out.println();

                    System.out.println("Plate Number: " + plateNumber);
                    System.out.println("Make: " + make);
                    System.out.println("Vehicle Type: " + vehicleType);
                    System.out.println("Engine Capacity: " + engineCapacity);
                    System.out.println("FuelType: " + fuelType);
                    System.out.println("Rate : " + rate);
                    System.out.println("Number OfSeats: " + numOfSeats);
                    System.out.println("vehicleAvailability: " + vehicleAvailability);

                }

                resultSet.close();
                database.closeConnection();
            } catch (SQLException s) {
                s.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
