import java.util.Scanner;

public class Tute4_4a {
    public static void main(String[] args) {
        double total = 0;
        double fastest = 9999;
        double slowest = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many laps: "); // prompt user enter number of laps
        int numberOfLaps = scan.nextInt();

        for(int i=1; i<=numberOfLaps; i++ ){
            System.out.print("Enter lap time "+ i +" lap : "); //prompt user enter lap time
            double lapTime = scan.nextDouble();

            if(lapTime<fastest){   //set fastest lap
                fastest = lapTime;
            }
            if(lapTime>slowest){  // set slowest lap
                slowest =lapTime;
            }

            total =total+lapTime;  // calculate total

        }

        System.out.println("fastest = "+fastest);
        System.out.println("slowest = " + slowest);
        double average = Math.round(total/numberOfLaps);  // calculate average
        System.out.println("average = "+ average);
    }
}
