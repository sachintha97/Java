import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your exam marks :");
        int marks=scan.nextInt();

        System.out.println("Did you pass the exam(y/n) :");
        String input=scan.next().toLowerCase();

        if(marks>=50){
            if(input.equals("y")){
            System.out.println("Pass");}

            else if(input.equals("n")){
                System.out.println("Fail");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
}
