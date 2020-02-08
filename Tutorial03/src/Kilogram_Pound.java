import java.util.Scanner;

public class Kilogram_Pound {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter \n 1. kilograms to pound \n 2. pound to kilograms ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter kilograms :");
                double kg = scan.nextDouble();
                double pound = kg * 2.204;
                System.out.println(kg + " kg =" + pound + " pound");
                break;

            case 2:
                System.out.println("Enter pounds :");
                pound = scan.nextDouble();
                kg = pound * 0.454;
                System.out.println(pound + " pound = " + kg + "kg");
                break;

            default:
                System.err.println("Invalid command");
        }
    }
}
