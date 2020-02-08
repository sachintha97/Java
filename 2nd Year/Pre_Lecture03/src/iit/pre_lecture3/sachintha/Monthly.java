/**sub class - monthly*/
package iit.pre_lecture3.sachintha;

public class Monthly extends Appointment {
    int day;

    Monthly(int day,String description) {
        super(description);
        this.day = day;
    }

    public String getDescription(){
        return description;
    }

    // check day
    public boolean occursOn(int day, int month, int year){

        return (this.day == day);
    }

    // return the string include day and description
    @Override
    public String toString() {
        return "Monthly{" + "day=" + day +
                ", description='" + description + '\'' +
                '}';
    }
}
