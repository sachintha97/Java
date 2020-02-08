package iit.assignment1.sachintha.Manager;

import iit.assignment1.sachintha.*;
import iit.assignment1.sachintha.Comparator.VehicleComparator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class WestminsterRentalVehicleManager extends User implements RentalVehicleManager {

        public static final int MAX_CAR_SLOTS = 50;
        private static ArrayList<Vehicle> carVehicle = new ArrayList<Vehicle>();
        private static ArrayList<Vehicle> motorbikeVehicle = new ArrayList<Vehicle>();
        private static ArrayList<Vehicle> newVehicle = new ArrayList<Vehicle>();

    //constructor with superclass user
    public WestminsterRentalVehicleManager(String userName, String userId, String email, String password) {
        super(userName, userId, email, password);
    }

    //default constructor
    public WestminsterRentalVehicleManager(){

    }

    // main method
    public static void main(String[] args) {
        //call database value get methods
        getAllCarValues();
        getAllMotorbikeValues();
         //call rental vehicle menu method
        RentalVehicleManager menu = new WestminsterRentalVehicleManager();
        ((WestminsterRentalVehicleManager) menu).rentalVehicleMenu();

    }

    // create objects
    Car car = new Car();
    MotorBike motorBike = new MotorBike();

    // System main menu list
    public boolean rentalVehicleMenu() {
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("WESTMINSTER RENTAL VEHICLE SYSTEM");
        System.out.println();
        System.out.println("Menu");
        System.out.println("1.Add Vehicle enter 1"+"\n"+"2.Delete Vehicle enter 2"+"\n"+"3.Print Vehicle List enter 3"+"\n"+"4.Search Vehicle enter 4"+"\n"+"5.Edit Vehicle Details enter 5"+"\n"+"6.Exit from menu enter 6");
        int choice = scan.nextInt();
        System.out.println("-------------------------------------");
        System.out.println();

        if(choice>6 || choice < 1){
            System.err.println("please enter 1 to 6 number.. you enter invalid number");
            rentalVehicleMenu();
        }

        switch (choice){
            case 1:
                getVehicleDetails();
                break;

            case 2:
                deleteVehicle();
                break;

            case 3:
                printVehicleList();
                break;

            case 4:
                searchVehicle();
                break;

            case 5:
                editVehicle();
                break;

            case 6:
                exit = true;
                break;
        }
        return exit;
    }

    // get data from database and storing in car array list object
    public static ArrayList<Vehicle> getAllCarValues(){
        DatabaseConnecter database = new DatabaseConnecter("root", "");
        try {
            database.connect();
            String sql = "Select * From car";
            ResultSet resultSet = database.getStatement().executeQuery(sql);
            while (resultSet.next()) {
                Car carObj = new Car(resultSet.getString("plate_number"), resultSet.getString("make"), resultSet.getString("model"), resultSet.getFloat("engine_capacity"), resultSet.getBigDecimal("rate"), resultSet.getString("fuel_type"), resultSet.getInt("num_of_seats"), resultSet.getBoolean("vehicle_availability"), resultSet.getInt("num_of_door"), resultSet.getInt("num_of_airbag"));
                carVehicle.add(carObj);
            }

        }
        catch (SQLException e){
            System.out.println("Exception occur while data getting motorbike table" + e);
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return carVehicle;
    }
        // get data from database and storing in motorbike array list object
    public static ArrayList<Vehicle> getAllMotorbikeValues(){
        DatabaseConnecter database = new DatabaseConnecter("root", "");
        try {
            database.connect();
            String sql = "Select * From motorbike";
            ResultSet resultSet = database.getStatement().executeQuery(sql);
            while (resultSet.next()) {
                MotorBike bikeObj = new MotorBike(resultSet.getString("plate_number"), resultSet.getString("make"), resultSet.getString("model"), resultSet.getFloat("engine_capacity"), resultSet.getBigDecimal("rate"), resultSet.getString("fuel_type"), resultSet.getInt("num_of_seats"), resultSet.getBoolean("vehicle_availability"), resultSet.getBoolean("storage_component"), resultSet.getBoolean("side_car"));
                motorbikeVehicle.add(bikeObj);
                }
        }
        catch (SQLException e){
            System.out.println("Exception occur while data getting motorbike table" + e);
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return motorbikeVehicle;
        }

    // get vehicle details
    public void getVehicleDetails(){

        try {
            Scanner scan2 = new Scanner(System.in);

            // get vehicle details
            System.out.print("Enter plate Number : ");
            String plateNum = scan2.next();

            System.out.print("Enter make : ");
            String make = scan2.next();

            System.out.print("Enter model : ");
            String model = scan2.next();

            System.out.print("Vehicle Type (car / motorbike) :");
            String type = scan2.next();

            System.out.print("Enter engine capacity (cc) : ");
            float engine = scan2.nextFloat();

            System.out.print("Enter rate : ");
            BigDecimal rate = scan2.nextBigDecimal();

            System.out.print("Enter fuel type : ");
            String fuel = scan2.next();

            System.out.print("Number of seats in vehicle : ");
            int seats = scan2.nextInt();

            System.out.print("Is Vehicle available (y/n) : ");
            String isAvailable = scan2.next();

            boolean available;
            if (isAvailable.equalsIgnoreCase("y") || isAvailable.equalsIgnoreCase("yes")){
                available = true;}
            else if (isAvailable.equalsIgnoreCase("n") || isAvailable.equalsIgnoreCase("no")){
                available = false;}
            else
                available = false;

            while (!(type.equalsIgnoreCase("car") || type.equalsIgnoreCase("motorbike") )){
                System.err.print("you entered vehicle type incorrect enter car or motorbike :");
                type = scan2.next();
            }
            switch (type.toLowerCase()) {
                // value inserting to car table
                case "car":
                    car.setPlateNumber(plateNum);
                    car.setMake(make);
                    car.setModel(model);
                    car.setTypeOfVehicle(type);
                    car.setEngineCapacity(engine);
                    car.setRate(rate);
                    car.setFuelType(fuel);
                    car.setNumOfSeats(seats);
                    car.setVehicleAvailability(available);

                    System.out.print("Num of Doors : ");
                    car.setNumOfDoors(scan2.nextInt());

                    System.out.print("Num of Air bags : ");
                    car.setNumOfAirbags(scan2.nextInt());
                    addVehicle(car);
                    break;

                // value inserting to motorbike table
                case "motorbike":
                    motorBike.setPlateNumber(plateNum);
                    motorBike.setMake(make);
                    motorBike.setModel(model);
                    motorBike.setTypeOfVehicle(type);
                    motorBike.setEngineCapacity(engine);
                    motorBike.setRate(rate);
                    motorBike.setFuelType(fuel);
                    motorBike.setNumOfSeats(seats);
                    motorBike.setVehicleAvailability(available);

                    System.out.print("Has storage component (y/n): ");
                    String hasStorage = scan2.next();

                    boolean storage;
                    if (hasStorage.equalsIgnoreCase("y") || hasStorage.equalsIgnoreCase("yes"))
                        storage = true;
                    else if (hasStorage.equalsIgnoreCase("n") || hasStorage.equalsIgnoreCase("no"))
                        storage = false;
                    else
                        storage = false;
                    motorBike.setStorageComponent(storage);

                    System.out.print("Has side car (y/n) : ");
                    String hasSideCar = scan2.next();

                    boolean sideCar;
                    if (hasSideCar.equalsIgnoreCase("y") || hasSideCar.equalsIgnoreCase("yes"))
                        sideCar = true;
                    else if (hasSideCar.equalsIgnoreCase("n") || hasSideCar.equalsIgnoreCase("no"))
                        sideCar = false;
                    else
                        sideCar = false;
                    motorBike.setHasSideCar(sideCar);
                    addVehicle(motorBike);
                    break;
            }

            System.out.print("Do you want exit the system (y/n)");
            String isQuit = scan2.next();

            if (isQuit.equalsIgnoreCase("n") || (isQuit.equalsIgnoreCase("no"))) {
                rentalVehicleMenu();
            }
        }
        // catch mismatch datatypes
        catch (InputMismatchException e){
            System.err.println("data type incorrect error : "+e);
            System.out.println();
            getVehicleDetails();
        }

    }

    // values add to array list
    @Override
    public void addVehicle(Vehicle vehicle) {
        //clear array list
        newVehicle.clear();
        DatabaseConnecter database = new DatabaseConnecter("root", "");
        try {
            if (vehicle instanceof Car) {
                // check car parking lots availablility
                if (carVehicle.size() < MAX_CAR_SLOTS) {
                    carVehicle.add(vehicle);
                    String sql = "insert into car(plate_number,make,model,engine_capacity,rate,fuel_type,num_of_seats,vehicle_availability,num_of_door,num_of_airbag) values('" + car.getPlateNumber() + "','" + car.getMake() + "', '" + car.getModel() + "', '" + car.getEngineCapacity() + "', '" + car.getRate() + "','" + car.getFuelType() + "','" + car.getNumOfSeats() + "','" + car.isVehicleAvailability() + "','" + car.getNumOfDoors() + "','" + car.getNumOfAirbags() + "');";
                    database.executeQuery(sql);
                    System.out.println("Car Table Insert Complete");
                    // add new vehicle array list to car data to genarate report
                    newVehicle.add(car);
                    // call generate report method
                    generateReport();

            } else {
                System.out.println("Maximum car park lots is attained , can't add new car");
            }
        }
        else if (vehicle instanceof MotorBike) {
            motorbikeVehicle.add(vehicle);
            String sql1 = "insert into motorbike(plate_number,make,model,engine_capacity,rate,fuel_type,num_of_seats,vehicle_availability,storage_component,side_car) values('" + motorBike.getPlateNumber() + "','" + motorBike.getMake() + "', '" + motorBike.getModel() + "', '" + motorBike.getEngineCapacity() + "', '" + motorBike.getRate() + "','" + motorBike.getFuelType() + "','" + motorBike.getNumOfSeats() + "','" + motorBike.isVehicleAvailability() + "','" + motorBike.isStorageComponent() + "','" + motorBike.isHasSideCar() + "');";
            database.executeQuery(sql1);
            System.out.println("Motorbike Table Insert Complete");
            // add new vehicle array list to data to genarate report
            newVehicle.add(motorBike);
            // call generate report method
            generateReport();

        }
    }
    catch(SQLException e){
        System.out.println("Exception occur while data inserting table" + e);
        e.printStackTrace();

    } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // delete value from database
    @Override
    public void deleteVehicle() {
        DatabaseConnecter database = new DatabaseConnecter("root", "");
        Scanner scan3 = new Scanner(System.in);
        // selecting the vehicle type
        System.out.print("What is the vehicle type do you want to delete (car/motorbike)? ");
        String vehicleChoice = scan3.next();

        System.out.print("Enter vehicle plate number : "); //selecting plate number want to delete
        String plateNum = scan3.next();

        boolean found = false;
        while (!(vehicleChoice.equalsIgnoreCase("car") || vehicleChoice.equalsIgnoreCase("motorbike") )){
            System.err.print("you entered vehicle type incorrect enter car or motorbike :");
            vehicleChoice = scan3.next();
        }
        switch (vehicleChoice.toLowerCase()) {

            case ("car"):

                try {
                    for(Vehicle carV : carVehicle){
                        if (carV.getPlateNumber().equals(plateNum)) {
                            carVehicle.remove(carV); // delete from car array list
                            System.out.println(carV);
                            found = true;

                            // delete value inside car table
                            String sqlcardelete = "delete from car where plate_number='" + plateNum + "'"; // delete select car from database
                            database.executeQuery(sqlcardelete);
                            System.out.println("Car Table Values Delete Complete");
                            // get available car parking lots
                            int count = MAX_CAR_SLOTS - carVehicle.size();
                            System.out.println("Available car parking slots = " + count);
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Values not found in car table");

                        }

                } catch (SQLException se) {
                    System.out.println("Error occur while data deleting " + se);
                    se.printStackTrace();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;

            case ("motorbike"):

                try {
                    for(Vehicle bikeV : motorbikeVehicle){
                        if (bikeV.getPlateNumber().equals(plateNum)) {
                            motorbikeVehicle.remove(bikeV); // delete from car array list
                            System.out.println(bikeV);
                            found = true;

                            // delete value inside car table
                            String sqlbikedelete = "delete from motorbike where plate_number='" + plateNum + "'"; // delete select car from database
                            database.executeQuery(sqlbikedelete);
                            System.out.println("Motorbike Table Values Delete Complete");
                            break;
                        }
                    }

                    // if given plate number not in database
                    if(!found) {
                        System.out.println("Values not found in motorbike table");

                    }

                } catch (SQLException se) {
                    System.out.println("Error occur while data deleting " + se);
                    se.printStackTrace();

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        System.out.print("Do you want exit the system (y/n)");
        String isQuit =scan3.next();

        if(isQuit.equalsIgnoreCase("n") || (isQuit.equalsIgnoreCase("no"))) {
            rentalVehicleMenu();
        }
    }

    // print list of vehicles
    @Override
    public void printVehicleList() {
        Scanner scan4 = new Scanner(System.in);
        System.out.print("What is the vehicle type print list (car/motorbike) : ");
        String type = scan4.next();
        while (!(type.equalsIgnoreCase("car") || type.equalsIgnoreCase("motorbike"))) {
            System.err.print("you entered vehicle type incorrect enter car or motorbike :");
            type = scan4.next();
        }

        switch (type.toLowerCase()) {
            case ("car"):
                // print car sort list according to the vehicle make
                Collections.sort(carVehicle, new VehicleComparator());
                System.out.println(carVehicle);
                break;

            case ("motorbike"):
                // print motorbike sort list according to the vehicle make
                Collections.sort(motorbikeVehicle, new VehicleComparator());
                System.out.println(motorbikeVehicle);
                break;
        }
        System.out.print("Do you want exit the system (y/n)");
        String isQuit = scan4.next();

        if (isQuit.equalsIgnoreCase("n") || (isQuit.equalsIgnoreCase("no"))) {
            rentalVehicleMenu();
        }
    }

    // view vehicle details
    @Override
    public void searchVehicle() {
        DatabaseConnecter database = new DatabaseConnecter("root", "");
        Scanner scan5 = new Scanner(System.in);
        System.out.print("What is the vehicle type view details (car/motorbike) : ");
        String type = scan5.next();

        System.out.print("Enter plate number do you want to view details : ");
        String plateNum = scan5.next();
        while (!(type.equalsIgnoreCase("car") || type.equalsIgnoreCase("motorbike") )){
            System.err.print("you entered vehicle type incorrect enter car or motorbike :");
            type = scan5.next();
        }
        boolean foundVehicle = false;
        switch (type.toLowerCase()) {
            case ("car"):
                // print car details related to plate number
                for (Vehicle searchCar : carVehicle) {
                    if (searchCar.getPlateNumber().equals(plateNum)) {
                        System.out.println(searchCar);
                        foundVehicle = true;
                        break;
                    }
                }

                if (!foundVehicle) {
                    System.out.println("Car not found!!!");
                }

                break;
            case ("motorbike"):
                // print motorbike details related to plate number
                for (Vehicle searchBike : motorbikeVehicle) {
                    if (searchBike.getPlateNumber().equals(plateNum)) {
                        System.out.println(searchBike);
                        foundVehicle = true;
                        break;
                    }
                }

                if (!foundVehicle) {
                    System.out.println("Motorbike not found!!!");
                }
                break;
        }
        System.out.print("Do you want exit the system (y/n)");
        String isQuit = scan5.next();

        if (isQuit.equalsIgnoreCase("n") || (isQuit.equalsIgnoreCase("no"))) {
            rentalVehicleMenu();
        }
    }

    // table details update
    @Override
    public void editVehicle() {
        DatabaseConnecter database = new DatabaseConnecter("root", "");
        Scanner scan6 = new Scanner(System.in);
        try {
            System.out.print("What is the vehicle type do you want to update (car/motorbike)? ");
            String editVehicle = scan6.next();

            System.out.print("Enter plate number do you want to edit details : ");
            String plateNum = scan6.next();

            System.out.print("Enter new rate : ");
            BigDecimal nRate = scan6.nextBigDecimal();

            System.out.print("Enter new number of seats : ");
            int nSeats = scan6.nextInt();

            System.out.print("Now available the vehicle (y/n): ");
            String nAvailabitity = scan6.next();
            boolean nAvailable;
            if (nAvailabitity.equalsIgnoreCase("y") || nAvailabitity.equalsIgnoreCase("yes")){
                nAvailable = true;}
            else if (nAvailabitity.equalsIgnoreCase("n") || nAvailabitity.equalsIgnoreCase("no")){
                nAvailable = false;}
            else
                nAvailable = false;

            while (!(editVehicle.equalsIgnoreCase("car") || editVehicle.equalsIgnoreCase("motorbike") )){
                System.err.print("you entered vehicle type incorrect enter car or motorbike :");
                editVehicle = scan6.next();
            }

            switch (editVehicle.toLowerCase()) {
                case ("car"):
                    // update details inside car table
                    try {
                        String sql2 = "update car set rate = '" + nRate + "', num_of_seats = '" + nSeats + "',vehicle_availability = '" + nAvailable + "' where plate_number='" + plateNum + "'";
                        database.executeQuery(sql2);
                        System.out.println("Car Table Update Complete");
                    } catch (SQLException e) {
                        System.out.println("Error occur while data updating" + e);
                        e.printStackTrace();

                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                    break;

                case ("motorbike"):
                    // update details inside motorbike table
                    try {
                        String sql2 = "update motorbike set rate = '" + nRate + "', num_of_seats = '" + nSeats + "', vehicle_availability = '" + nAvailable + "' where plate_number='" + plateNum + "'";
                        database.executeQuery(sql2);
                        System.out.println("Motorbike Table Update Complete");
                    } catch (SQLException e) {
                        System.out.println("Error occur while data updating" + e);
                        e.printStackTrace();

                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                    break;
            }
        }
        catch (InputMismatchException e){
            System.err.println("data type incorrect error "+e);
            System.out.println();
            editVehicle();
        }
        System.out.print("Do you want exit the system (y/n)");
        String isQuit =scan6.next();

        if(isQuit.equalsIgnoreCase("n") || (isQuit.equalsIgnoreCase("no"))) {
            rentalVehicleMenu();
        }
    }

    // generate report according to vehicle add to system
    @Override
    public void generateReport() {
        // file path
        File file = new File("vehicleDetails.txt");
        FileWriter fw=null;
        PrintWriter pw =null;

        try {
            fw = new FileWriter(file, true) ; // true- append
            pw = new PrintWriter(fw, true); // true - auto flush
                for (Vehicle ve : newVehicle) {
                    DateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date obj = new Date();
                    pw.println(ve.getTypeOfVehicle() + " : " +ve.getPlateNumber() + " : " + ve.getMake() + " : " + ve.getModel() + " : " + dtf.format(obj));
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "WestminsterRentalVehicleManager{} " + super.toString();
    }
}
