import java.util.Scanner;

public class Income_Tax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income=scan.nextDouble();

        if(income>=0 && income<=18200){
            System.out.println("You must pay tax = 0");
        }
        else if(income>=18201 && income<=37000){
            double tax=(income-18200)*0.19;
            System.out.println("You must pay tax = $"+tax);
        }
        else if(income>=37001 && income<=80000){
            double tax=3572+((income-37000)*0.325);
            System.out.println("You must pay tax = $"+tax);
        }
        else if(income>=80001 && income<=180000){
            double tax=17547+((income-80000)*0.37);
            System.out.println("You must pay tax = $"+tax);
        }
        else if(income>=180000){
            double tax=54547+((income-180000)*0.45);
            System.out.println("You must pay tax = $"+tax);
        }
        else{
            System.err.println("Invalid income");
        }
    }
}
