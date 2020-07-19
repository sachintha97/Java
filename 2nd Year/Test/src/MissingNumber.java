//public class MissingNumber {
//    public static void main(String[] args) {
//        int[] array = {1,2,3,5,6,7,8};
//
//        for (int i = 0; i < array.length -1 ; i++) {
//            if(array[i] != i+1){
//                System.out.println("Missing Number = " + (i+1));
//            }
//        }
//    }
//}

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        //10 is missing
        int[] numbers = {1,2,3,4,5,6,7,8,9,11,12};

        // N = 12
        int N = numbers.length+1;
        int idealSum = (N * (N + 1)) / 2;
        int sum = Arrays.stream(numbers).sum(); // sum of all the numbers of array

        int missingNumber = idealSum - sum; // 78-68
        System.out.println("Missing Number: "+missingNumber);
    }
}

//************** for each loop(enhanced loop) ************************
//import java.util.*;
//public class Exercise24 {
//    public static void main(String[] args) {
//
//        int total_num;
//        int[] numbers = new int[]{1,2,3,4,6,7};
//        total_num = 7;
//        int expected_num_sum = total_num * ((total_num + 1) / 2);
//        int num_sum = 0;
//        for (int i: numbers) {
//            num_sum += i;
//        }
//        System.out.print( expected_num_sum - num_sum);
//        System.out.print("\n");
//    }
//}