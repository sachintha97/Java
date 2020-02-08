import java.util.Random;
import java.util.Scanner;

public class Tute4_2b {
    public static void main(String[] args) {
        Random rand = new Random();
        int guessNumber; //declaration guessNumber
        int hiddenNumber = rand.nextInt(100) + 1; //100 is the maximum random number and 1 is minimum
        int guessCounter = 0; //initialize guessCounter
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Guess the number between 1 to 100 : ");
            guessNumber = scan.nextInt();
            guessCounter++;

            if (guessNumber > hiddenNumber) {
                System.out.println("Too high !");
            }
            else if (guessNumber < hiddenNumber) {
                System.out.println("Too low !");

            }
            else {
                System.out.println(hiddenNumber + " is correct, you win!");
                System.out.println("You got in " +guessCounter+ " guesses");
                break;
            }


        }



    }

}
