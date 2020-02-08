import java.util.Scanner;

public class Litre_Quart {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter \n 1. litre to quart \n 2. quart to litre ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter litres :");
                double l = scan.nextDouble();
                double quart = l * 0.878;
                System.out.println(l + " l =" + quart + " quarts");
                break;

            case 2:
                System.out.println("Enter quart :");
                quart = scan.nextDouble();
                l = quart * 1.137;
                System.out.println(quart + " quart = " + l + " l");
                break;

            default:
                System.err.println("Invalid command");
        }
    }
}
