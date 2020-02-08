package iit.assignment1.sachintha.Manager;

import iit.assignment1.sachintha.Vehicle;

public interface RentalVehicleManager {

    public abstract void addVehicle(Vehicle vehicle);
    public abstract void deleteVehicle();
    public abstract void editVehicle();
    public abstract void printVehicleList();
    public abstract void searchVehicle();
    public abstract void generateReport();

}
