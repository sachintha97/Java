import java.util.Random;

public class Tute4_1a {
    public static void main(String[] args) {
            int count = 1; // initialize count
            Random rand = new Random(); // get random numbers
            int number;

              do {
                    number = rand.nextInt(10) + 0; //10 is the maximum random number and 0 is minimum
                    System.out.println("Number " + count + " was " + number);
                    count++;      // increment count

        }
              while (number != 0);



    }
}
