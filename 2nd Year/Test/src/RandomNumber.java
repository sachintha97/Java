import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args) {
        /////////Use random class
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        double double_random=rand.nextDouble();
        float float_random=rand.nextFloat();

        System.out.println("RandomNumber integer value from 0 to " + (upperbound-1) + " : "+ int_random);
        System.out.println("RandomNumber float value between 0.0 and 1.0 : "+float_random);
        System.out.println("RandomNumber double value between 0.0 and 1.0 : "+double_random);


        ///////////using Math.random
        int min = 50;
        int max = 100;
        //Generate random double value from 50 to 100
        System.out.println("Random value in double from "+min+" to "+max+ ":");
        double random_double = Math.random() * (max - min + 1) + min;
        System.out.println(random_double);

        //Generate random int value from 50 to 100
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);

        //////Use ThreadLocalRandom

        // Generate random integers
        int intRandom = ThreadLocalRandom.current().nextInt();

        // Print random integers
        System.out.println("Random Integers: " + intRandom);

        // Generate Random doubles
        double double_rand = ThreadLocalRandom.current().nextDouble();

        // Print random doubles
        System.out.println("Random Doubles: " + double_rand);

        // Generate random booleans
        boolean boolean_rand = ThreadLocalRandom.current().nextBoolean();

        // Print random booleans
        System.out.println("Random Booleans: " + boolean_rand);
    }
}
