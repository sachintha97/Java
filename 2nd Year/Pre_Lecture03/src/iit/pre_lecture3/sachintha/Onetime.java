/** sub class - onetime*/
package iit.pre_lecture3.sachintha;

public class Onetime extends Appointment {
    int day;
    int month;
    int year;

    Onetime(int day, int month, int year, String description) {
        super(description);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDescription(){
        return description;
    }

    //check day, month and year
    public boolean occursOn(int day, int month, int year){

        return (this.day == day) && (this.month == month) && (this.year == year);
    }

    // return the string include day , month , year, description
    @Override
    public String toString() {
        return "Onetime{" + "day=" + day + ", month=" + month +
                ", year=" + year + ", description='" + description + '\'' +
                '}';
    }
}
