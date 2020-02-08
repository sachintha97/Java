package iit.assignment1.sachintha;

import java.math.BigDecimal;

public class Car extends Vehicle {
    // car special details
    private int numOfDoors;
    private int numOfAirbags;

    // default constructor
    public Car() {
    }

    // constructor with super class constructor
    public Car(String plateNumber, String make,String model, float engineCapacity, BigDecimal rate, String fuelType, int numOfSeats,boolean vehicleAvailability , int numOfDoors , int numOfAirbags) {
        super(plateNumber, make,model, engineCapacity, rate, fuelType, numOfSeats,vehicleAvailability);
        this.numOfDoors = numOfDoors;
        this.numOfAirbags = numOfAirbags;
    }

    // Accessor functions
    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfAirbags() {
        return numOfAirbags;
    }

    public void setNumOfAirbags(int numOfAirbags) {
        this.numOfAirbags = numOfAirbags;
    }

    @Override
    public String toString() {
        return "" +super.toString()+
                "numOfDoors=" + numOfDoors +'\n'+
                "numOfAirbags="+ numOfAirbags +'\n'+
                "" +'\n';
    }
}
