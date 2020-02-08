/**super class - appointment*/
package iit.pre_lecture3.sachintha;

public abstract class Appointment {

    String description;

    //Appointment class constructor
    Appointment(String description){
        this.description = description;
    }

    // abstract method occurson
    public abstract boolean occursOn(int day, int month, int year);

}

//    Appointment(int day , String description){
//        this.description = description;
//        this.day = day;
//
//    }
//
//    Appointment(int day , int month , int year,String description){
//        this.description = description;
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }

