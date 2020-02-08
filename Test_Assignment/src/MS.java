import java.util.Scanner;

public class MS {

    public static void programme() {
        // TODO code application logic here

        int i, j;
        int sum_row, sum_col, sum_diagonal = 0, sum = 0;
        boolean isMagic=true;

        //creating new scanner object which takes InputStream as parameter
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter square size :");
        int n= scan.nextInt();

        int[][] squareArray = new int[n][n];

        //Read number for each cell
        int count = 1;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++) {
                System.out.print("Enter number" + count++ + " - ");
                squareArray[i][j] = scan.nextInt();
            }
        }

        //Display square
        System.out.println("Square : ");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++)
                System.out.print(squareArray[i][j] + " ");
            System.out.println();
        }

        //Calculate sum of the first row
        for (j=0; j<n; j++){
            sum += squareArray[0][j];
        }

        //Calculate sum of 2nd and 3rd row
        for (i=1; i<n; i++) {
            sum_row = 0;
            for (j=0; j<n; j++)
                sum_row += squareArray[i][j];
            if (sum_row != sum) {
                isMagic = false;

            }
        }
        //Calculate sum of each column
        if (isMagic) {
            for (j=0; j<n; j++) {
                sum_col = 0;
                for (i=0; i<n; i++)
                    sum_col += squareArray[i][j];
                if (sum_col != sum) {
                    isMagic = false;

                }
            }
        }
        //Calculate sum of first diagonal
        if (isMagic) {
            for (i=0; i<n; i++)
                for (j=0; j<n; j++)
                    if (i==j){
                        sum_diagonal += squareArray[i][j];}
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
                        sum_diagonal += squareArray[i][j];}
            if (sum_diagonal != sum) {
                isMagic = false;
            }
        }

        //Display result
        System.out.print("Is Magic square ? :");
        if (isMagic){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.print("Is Lo Shu square ? : ");
        if (sum ==15 && (isLoShuSquare(squareArray)) ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    //Check if Lo Shu square
    public static boolean isLoShuSquare(int[][] square1) {
        int number, i, j;
        int[] frequency = new int[10];
        for (number = 1; number < 10; number++) {
            frequency[number] = 0;
        }
        // Loop through each value in the square
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                // Invalid number (all values must be between 1 - 9)
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


    public static void main(String[] args) {
        boolean continue_programme=true;
        while (continue_programme) {
            System.out.println("Enter:\n 1.go to menu \n 2.exit");
            Scanner scan = new Scanner(System.in);
            int choice_of_user = scan.nextInt();
            if (choice_of_user == 1) {
                programme();
            } else if (choice_of_user == 2) {
                System.out.println("Bye Bye!!!!");
                continue_programme=false;
            }else{
                System.out.println(" Try Again");
            }
        }


    }
}
