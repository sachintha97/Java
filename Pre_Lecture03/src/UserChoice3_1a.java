import java.util.Scanner;

public class UserChoice3_1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Select [y]es, [n]o or [q]uit:");
        char choice = scan.next().charAt(0);

        if(choice=='y' || choice=='Y'){
            System.out.println("You selected 'yes'");
        }

        else if(choice=='n' || choice=='N'){
            System.out.println("You selected 'no'");
        }

        else if(choice=='q' || choice=='Q'){
            System.out.println("You selected 'quit'");
        }

        else{
            System.out.println("Invalid Selection");
        }
    }
}
