import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Start: ");
        int start = scan.nextInt();

        System.out.print("Enter Finish: ");
        int finish = scan.nextInt();

        System.out.print("Enter Increment: ");
        int increment = scan.nextInt();

        printTable( start, finish , increment);

    }
    public static void printTable(int start, int finish , int increment){
        System.out.println("Celsius   Fahrenheit");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _");

        for (double celsius=start; celsius<=finish; celsius=celsius+increment){
            double fahrenheit = celsius * 9 / 5 + 32;

            System.out.println(celsius + "       "+fahrenheit);

        }

    }
}
