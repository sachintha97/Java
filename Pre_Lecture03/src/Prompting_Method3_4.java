import java.util.Scanner;

public class Prompting_Method3_4 {

    public static double prompt(String input){
        Scanner scan = new Scanner(System.in);
        System.out.print(input);
        return scan.nextDouble();

    }

    public static void main(String[] args) {
        double euro = prompt("Enter amount in Euros: ");
        double sterling = euro * 0.86;
        System.out.println( euro + " Euros in sterling is " + sterling + " sterling");
    }
}
