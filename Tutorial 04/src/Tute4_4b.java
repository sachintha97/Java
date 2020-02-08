import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Tute4_4b {
    public static void main(String[] args) {

        double fastest = 9999;
        double slowest = 0;
        double total =0;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many laps: "); // prompt user enter number of laps
        int numberOfLaps = scan.nextInt();

        List<Double> lapTimeList = new ArrayList<>(); // creating arraylist

        for(int i=1; i<=numberOfLaps; i++ ) {
            System.out.print("Enter lap time " + i + " lap : "); //prompt user enter lap time
            double lapTime = scan.nextDouble();
            lapTimeList.add(lapTime);  // add lapTime to lapTimeList
        }

            for (int j = 0; j < lapTimeList.size(); j++) {
                total = total+ lapTimeList.get(j);   //calculate total

        }
        fastest = Collections.min(lapTimeList); // finding fastest lap
        slowest = Collections.max(lapTimeList);  // finding slowest lap
        System.out.println("fastest = "+fastest);
        System.out.println("slowest = " + slowest);


        double average = Math.round(total/lapTimeList.size());  // calculate average
        System.out.println("average = "+ average);


    }
}
