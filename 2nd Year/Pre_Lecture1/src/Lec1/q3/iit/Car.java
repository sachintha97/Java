package Lec1.q3.iit;

public class Car {
    double fuelEfficiency; //miles per gallon
    double fuelLevel ;

    //constructor of the class Car
    public Car(double fuelEfficiency){
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = 0;
    }

    public void addGas(double fuelLevel){
        this.fuelLevel += fuelLevel;
    }

    public double getGasLevel(){
        return this.fuelLevel;
    }

    // Calculate fuel level
    public void drive( double miles){
        this.fuelLevel = this.fuelLevel - (miles / this.fuelEfficiency);
    }

}
