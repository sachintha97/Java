import java.util.Scanner;

public class Metre_Foot {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter \n 1. metres to foot \n 2. foot to metres ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter metres :");
                double m = scan.nextDouble();
                double feet = m * 3.281;
                System.out.println(m + " m =" + feet + " feet");
                break;

            case 2:
                System.out.println("Enter foots :");
                feet = scan.nextDouble();
                m = feet * 0.305;
                System.out.println(feet + " feet = " + m + "m");
                break;

            default:
                System.err.println("Invalid command");
        }
    }
}
