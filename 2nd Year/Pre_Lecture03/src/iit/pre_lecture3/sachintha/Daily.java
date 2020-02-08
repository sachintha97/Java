/** sub class - daily*/
package iit.pre_lecture3.sachintha;

public class Daily extends Appointment {
    Daily(String description) {
        super(description);
    }

    public String getDescription(){
        return description;
    }

    // always true
    public boolean occursOn(int day, int month, int year){

        return true;
    }

    // return the string include description
    @Override
    public String toString() {
        return "Daily{" + "description='" + description + '\'' + '}';
    }
}
