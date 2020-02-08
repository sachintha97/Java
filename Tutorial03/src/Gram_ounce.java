import java.util.Scanner;

public class Gram_ounce {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter \n 1. grams to ounce \n 2. ounce to grams ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter grams :");
                double gram = scan.nextDouble();
                double ounce = gram * 0.035;
                System.out.println(gram + " g =" + ounce + " ounce");
                break;

            case 2:
                System.out.println("Enter ounce :");
                ounce = scan.nextDouble();
                gram = ounce * 28.35;
                System.out.println(ounce + " ounce = " + gram + " g");
                break;

            default:
                System.err.println("Invalid command");
        }
    }
}
