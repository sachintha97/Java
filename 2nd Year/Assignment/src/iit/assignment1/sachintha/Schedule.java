package iit.assignment1.sachintha;

import java.util.Date;

public class Schedule {
    // schedule data
    private Date pickUpDate;
    private Date dropOffDate;
    private Vehicle rent;

    //default constructor
    public Schedule() {
    }

    // constructor with arguments
    public Schedule(Date pickUpDate, Date dropOffDate, Vehicle rent) {
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
        this.rent = rent;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public Vehicle getRent() {
        return rent;
    }

    public void setRent(Vehicle rent) {
        this.rent = rent;
    }

    public double calculateRent(){
        double cost =0;
        return cost;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "pickUpDate=" + pickUpDate +
                ", dropOffDate=" + dropOffDate +
                ", rent=" + rent +
                '}';
    }
}
