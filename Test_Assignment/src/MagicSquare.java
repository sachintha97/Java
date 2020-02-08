import java.util.Scanner;

public class MagicSquare {
    private static int i, j; //i=index of row, j=index of column
    private static int number; // number = user input number
    private static int sum_row, sum_col, sum_diagonal = 0, sum = 0;
    private static boolean magic = false;
    private static int[][] squareArray = new int[3][3];

    public static boolean isAllSame(int[] arr) {
        for (int num : arr) {
            if (num != arr[0]){
                return false;
            }
        }
        return true;
    }

    //Check if magic square
    public static boolean isMagic(int[][] square) {

        // create an empty array with an initial capacity
        int[] array = new int[8];

        //Calculate sum of the first row
        for (j = 0; j < 3; j++) {
            sum += square[0][j];
            array[0] = sum;
        }
        //Calculate sum of second and third row
        for (i = 1; i < 3; i++) {
            sum_row = 0;
            for (j = 0; j < 3; j++) {
                sum_row += square[i][j];
            }
            array[i] = sum_row;
        }
        //Calculate sum of each column
        for (j = 0; j < 3; j++) {
            sum_col = 0;
            for (i = 0; i < 3; i++) {
                sum_col += square[i][j];
            }
            array[j + 3] = sum_col;
        }
        //Calculate sum of first diagonal
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    sum_diagonal += square[i][j];

                }
            }
            array[6] = sum_diagonal;
        }


        sum_diagonal = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if ((i + j) == 2) {
                    sum_diagonal += square[i][j];

                }
            }
            array[7] = sum_diagonal;
        }

        boolean isMagic = isAllSame(array);
        return isMagic;
    }

    //Check if Lo Shu square
    public static boolean isLoShuSquare(int[][] square1) {
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

        //creating new scanner object which takes InputStream as parameter
        Scanner scan = new Scanner(System.in);

        //Read number for each cell
        System.out.println("Enter numbers - ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                squareArray[i][j] = scan.nextInt();
            }
        }

        //Display square
        System.out.println("Square : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        //Display results
        magic = isMagic(squareArray);

        System.out.println("Is Magic Square? : " + magic);

        System.out.print("Is Lo Shu Square ? : ");
        if (sum == 15 && (isLoShuSquare(squareArray))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
