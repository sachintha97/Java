/**appointment test class*/
package iit.pre_lecture3.sachintha;

import java.util.Scanner;

public class AppointmentResult {
    public static void main(String[] args) {

        // create new array list for appointments
        Appointment[] appointments = new Appointment[5];

        appointments[0] = new Onetime(1,10,2019,"see the doctor");
        appointments[1] = new Monthly(1,"see the dentist");
        appointments[2] = new Monthly(19,"meet physiotherapist");
        appointments[3] = new Daily("see the dentist");
        appointments[4] = new Onetime(22,11,2019,"see the psychiatrist");

        // user input day
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your appointment date : " );
        int day = scan.nextInt();
        // check day validation
        while (!(day>=1 && day<=31)){
            System.out.print("Please enter valid date 1-31 : ");
            day = scan.nextInt();
        }

        // user input month
        System.out.print("Enter your appointment month : " );
        int month = scan.nextInt();
        // check month validation
        while (!(month>=0 && month<=12)){
            System.out.print("Please enter valid month : ");
            month = scan.nextInt();
        }

        // user input year
        System.out.print("Enter your appointment year : " );
        int year = scan.nextInt();
        // check year validation
        while (!(year>=0)){
            System.out.print("Please enter valid year : ");
            year = scan.nextInt();
        }

        // check user enter appointment date match with appointments list
        for(Appointment appointment : appointments){
            if(appointment.occursOn(day, month, year)){
                System.out.println(appointment.toString());
            }
        }
    }
}
