import java.util.Scanner;

public class Centimeters_Inch {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter \n 1. centimetres to inch \n 2. inch to centimetres ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter centimetres :");
                double cm = scan.nextDouble();
                double inch = cm * 0.393;
                System.out.println(cm + " cm =" + inch + " inches");
                break;

            case 2:
                System.out.println("Enter inches :");
                inch = scan.nextDouble();
                cm = inch * 2.54;
                System.out.println(inch + " inch = " + cm + "cm");
                break;

            default:
                System.err.println("Invalid command");
            }
        }
}
