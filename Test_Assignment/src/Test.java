import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        getValue(); // Call get value method

        //
        boolean stop_programme = false;
        while (!stop_programme) {
            try {
                System.out.println("Enter:\n 1.enter a new square \n 2.exit");
                Scanner scan = new Scanner(System.in);
                int choice_of_user = scan.nextInt();
                if (choice_of_user == 1) {
                    getValue();
                }
                else if (choice_of_user == 2) {
                    System.out.println("Bye Bye!!!!");
                    stop_programme = true;
                }
                else {
                    System.out.println(" Enter number 1 or 2 ");
                }
            }
            catch (InputMismatchException e) {
                System.err.println("invalid input enter 1 or 2");
            }
        }
    }


    public static void getValue() {

        int i, j; //i=index of row, j=index of column

        //Creating new scanner object
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter square size :");
            int n = scan.nextInt(); // n= user input square size
            // Check square size is more than 1
            if (n < 2) {
                System.out.println("Invalid square size please enter a square this more than 1");
                getValue();
            } else {
                try {
                    int[][] squareArray = new int[n][n]; // creating new 2D array

                    //Read number for each cell
                    System.out.println("Enter numbers - ");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++)
                            squareArray[i][j] = scan.nextInt();
                    }
                    displaySquare(n, squareArray);
                }
                catch (InputMismatchException e) {
                    System.err.println("invalid input");
                    getValue();
                }
            }
        }
        catch(InputMismatchException e){
            System.err.println("invalid input, enter integer more than 1");
            getValue();

        }
    }

    public static void displaySquare(int n,int[][] squareArray) {

        //Display square
        int i,j; //i=index of row, j=index of column
        System.out.println("Square : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(squareArray[i][j] + " ");
            System.out.println();
        }
        isMagicSquare(squareArray,n);
    }


    public static void isMagicSquare(int[][] square,int n) {

        //Check if Magic square
        int i,j; //i=index of row, j=index of column
        int sum_row, sum_col; // declare sum of row and column
        int sum_diagonal = 0, sum = 0; //initialize sum and sum of diagonals
        boolean isMagic = true;

        //Calculate sum of the 1st row and equal to sum
        for (j=0; j<n; j++){
            sum += square[0][j];
        }

        //Calculate sum of 2nd and 3rd row
        for (i=1; i<n; i++) {
            sum_row = 0;
            for (j=0; j<n; j++)
                sum_row += square[i][j];
            if (sum_row != sum) {
                isMagic = false;

            }
        }
        //Calculate sum of each column
        if (isMagic) {
            for (j=0; j<n; j++) {
                sum_col = 0;
                for (i=0; i<n; i++)
                    sum_col += square[i][j];
                if (sum_col != sum) {
                    isMagic = false;

                }
            }
        }
        //Calculate sum of 1st diagonal
        if (isMagic) {
            for (i=0; i<n; i++)
                for (j=0; j<n; j++)
                    if (i==j){
                        sum_diagonal += square[i][j];}
            if (sum_diagonal != sum) {
                isMagic = false;
            }
        }

        //Calculate sum of second diagonal
        if (isMagic) {
            sum_diagonal = 0;
            for (i=0; i<n; i++)
                for (j=0; j<n; j++)
                    if ((i+j) == n-1){
                        sum_diagonal += square[i][j];}
            if (sum_diagonal != sum) {
                isMagic = false;
            }
        }
        //Display result
        //magic square results
        System.out.print("Is Magic square ? : ");
        if (isMagic){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //lo-shu square result
        System.out.print("Is Lo Shu square ? : ");
        if (sum == 15 && (isLoShuSquare(square))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }


    public static boolean isLoShuSquare(int[][] square1) {

        //Check if Lo Shu square
        int number, i, j; //i=index of row, j=index of column, number = user input numbers

        int[] frequency = new int[10];
        for (number = 1; number < 10; number++) {
            frequency[number] = 0;
        }
        // Loop through each value in the square
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                // Check invalid number (all values must be between 1 - 9)
                if (square1[i][j] < 1 || square1[i][j] > 9)
                    return false;

                // Increase the frequency for this number
                frequency[square1[i][j]]++;
            }
        }

        /* If any number 1 to 9 display more times or does not display exactly once
        then the square is not Lo Shu magic square.
         */
        for (number = 1; number < 10; number++) {
            if (frequency[number] != 1) {
                return false;
            }
        }
        return true;

    }



}
