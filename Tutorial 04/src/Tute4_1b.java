import java.util.Random;

public class Tute4_1b {
    public static void main(String[] args) {
        int count = 1;
        Random rand = new Random();
        int number;

        do {
            number = rand.nextInt(10) + 0; //10 is the maximum random number and 0 is minimum
            System.out.println("Number " + count + " was " + number);
            count++;
            if(number == 7){
                System.out.println("Lucky 7!");
            }

        }
        while (number != 0);



    }
}
