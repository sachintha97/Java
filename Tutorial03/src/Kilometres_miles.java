import java.util.Scanner;

public class Kilometres_miles {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter \n  1. Kilometres to miles \n  2. miles to kilometres ");
        int choice = scan.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter kilometers :");
                double km=scan.nextDouble();
                double miles=km*0.621;
                System.out.println(km+" km ="+miles+" miles");
                break;

            case 2:
                System.out.println("Enter miles :");
                double mile = scan.nextDouble();
                double kms= mile*1.609 ;
                System.out.println( mile+" mile = "+kms+ "km");
                break;

            default:
                System.err.println("Invalid command");
        }





    }
}
