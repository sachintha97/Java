/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms;
import java.util.Scanner;
/**
 *
 * @author Sachintha
 */
public class MS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, j;
	int sum_row, sum_col, sum_diagonal = 0, sum = 0;
	boolean magic=true;
	int[][] square = new int[3][3];
        //creating new scanner object which takes InputStream as parameter
	Scanner scan = new Scanner(System.in);
        
        //Read number for each cell
	System.out.println("Enter numbers - ");
	for (i=0; i<3; i++){
            for (j=0; j<3; j++)
                square[i][j] = scan.nextInt();
        }
        
        //Display square
	System.out.println("Square : ");
	for (i=0; i<3; i++) {
            for (j=0; j<3; j++)
                System.out.print(square[i][j] + " ");
            System.out.println();
	}
        
        //Calculate sum of the first row
        for (j=0; j<3; j++){
            sum += square[0][j];
        }
        
        //Calculate sum of 2nd and 3rd row
	for (i=1; i<3; i++) {
            sum_row = 0;
            for (j=0; j<3; j++)
                sum_row += square[i][j];
            if (sum_row != sum) {
                magic = false;
                
	   }
	}
        //Calculate sum of each column
	if (magic) {
            for (j=0; j<3; j++) {
                sum_col = 0;
                for (i=0; i<3; i++)
                    sum_col += square[i][j];
                if (sum_col != sum) {
                    magic = false;
                    
                 }
                }
            }
        //Calculate sum of first diagonal
        if (magic) {
            for (i=0; i<3; i++)
                for (j=0; j<3; j++)
                    if (i==j){
                        sum_diagonal += square[i][j];}
            if (sum_diagonal != sum) {
                magic = false;
	   }
	}
        
        //Calculate sum of second diagonal
	if (magic) {
            sum_diagonal = 0;
            for (i=0; i<3; i++)
                for (j=0; j<3; j++)
                    if ((i+j) == 2){
                        sum_diagonal += square[i][j];}
            if (sum_diagonal != sum) {
                magic = false;
	   }
	}
        
        //Display result
        
	if (magic){
            System.out.println("It is a magic square!");
        }
        else{
	   System.out.println("It is not a magic square.");
        }
        
        System.out.print("Is Lo Shu square ? : ");
        if (sum !=15 ){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
    
}