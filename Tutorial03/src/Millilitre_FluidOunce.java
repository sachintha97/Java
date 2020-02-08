import java.util.Scanner;

public class Millilitre_FluidOunce {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter \n 1. millilitres to fluid ounce \n 2. fluid ounce to millilitres ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter millilitres :");
                double ml = scan.nextDouble();
                double fluid_ounce = ml * 0.035;
                System.out.println(ml + " ml =" + fluid_ounce + " fluid ounce");
                break;

            case 2:
                System.out.println("Enter fluid ounce :");
                fluid_ounce = scan.nextDouble();
                ml = fluid_ounce * 28.413;
                System.out.println( fluid_ounce+ " fluid ounce = " + ml + "ml");
                break;

            default:
                System.err.println("Invalid command");
        }
    }
}
