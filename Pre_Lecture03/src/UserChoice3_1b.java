import java.util.Scanner;

public class UserChoice3_1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Select [y]es, [n]o or [q]uit:");
        char choice = scan.next().charAt(0);

        switch (choice){
            case ('y'):
            case ('Y'):
                System.out.println("You selected 'yes'");
                break;
            case ('n'):
            case ('N'):
                System.out.println("You selected 'no'");
                break;

            case ('q'):
            case ('Q'):
                System.out.println("You selected 'quit'");
                break;

                default:
                    System.out.println("Invalid selection");
        }
    }
}
