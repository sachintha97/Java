package iit.assignment1.sachintha;

import java.math.BigDecimal;

public class MotorBike extends Vehicle {
    private boolean storageComponent;
    private boolean hasSideCar;

    // default constructor
    public MotorBike() {
    }

    //constructor with super class constructor
    public MotorBike(String plateNumber, String make,String model, float engineCapacity, BigDecimal rate, String fuelType, int numOfSeats, boolean vehicleAvailability , boolean storageComponent, boolean hasSideCar) {
        super(plateNumber, make, model, engineCapacity, rate, fuelType, numOfSeats,vehicleAvailability);
        this.storageComponent = storageComponent;
        this.hasSideCar = hasSideCar;
    }

    // motorbike functions
    public boolean isStorageComponent() {
        return storageComponent;
    }

    public void setStorageComponent(boolean storageComponent) {
        this.storageComponent = storageComponent;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public String toString() {
        return "" +super.toString()+
                "storageComponent=" + storageComponent +'\n'+
                "hasSideCar=" + hasSideCar +'\n'+
                " " ;
    }
}
