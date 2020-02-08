package iit.assignment1.sachintha.Comparator;

import iit.assignment1.sachintha.Vehicle;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {
    // compare two objects
    public int compare(Vehicle obj1 , Vehicle obj2){
        return obj1.getMake().compareTo(obj2.getMake());
    }
}
