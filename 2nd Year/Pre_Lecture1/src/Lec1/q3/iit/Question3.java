package Lec1.q3.iit;

public class Question3 {
    public static void main(String[] args) {
        Car myHybrid = new Car(50.0);  //50 Miles Per Gallon
        myHybrid.addGas(20.0);  //Tank 20 Gallons
        myHybrid.drive(100.0); // Drive 100 Miles
        System.out.println(myHybrid.getGasLevel()); //Print Fuel Remaining.
    }
}
