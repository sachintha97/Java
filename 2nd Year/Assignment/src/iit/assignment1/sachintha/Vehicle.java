package iit.assignment1.sachintha;

import java.math.BigDecimal;

public abstract class Vehicle implements Comparable<Vehicle> {
    // vehicles basic details
    private String plateNumber;
    private String make;
    private String model;
    private String typeOfVehicle;
    private float engineCapacity;
    private BigDecimal rate;
    private String fuelType;
    private boolean vehicleAvailability;
    private int numOfSeats;


    // constructor with arguments
    public Vehicle(String plateNumber, String make, String model, float engineCapacity, BigDecimal rate, String fuelType, int numOfSeats,boolean vehicleAvailability) {
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.rate = rate;
        this.fuelType = fuelType;
        this.numOfSeats = numOfSeats;
        this.vehicleAvailability = vehicleAvailability;
    }

    // default constructor
    public Vehicle() {
    }

    // Accessor function
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isVehicleAvailability() {
        return vehicleAvailability;
    }

    public void setVehicleAvailability(boolean vehicleAvailability) {
        this.vehicleAvailability = vehicleAvailability;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return '\n'+"plateNaumber='" + plateNumber + '\'' +'\n'+
                "make='" + make + '\'' +'\n'+
                "model='" + model + '\'' +'\n'+
                "engineCapacity=" + engineCapacity +'\n'+
                "rate=" + rate +'\n'+
                "fuelType='" + fuelType + '\'' +'\n'+
                "vehicleAvailability=" + vehicleAvailability+'\n' ;
    }

    // over ride compare method
    @Override
    public int compareTo(Vehicle obj) {
        return this.getMake().compareTo(obj.getMake());
    }
}
