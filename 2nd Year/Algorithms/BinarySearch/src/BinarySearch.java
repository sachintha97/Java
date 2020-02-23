/**Binary Search - Search a sorted array by repeatedly dividing the search interval in half.
 * Begin with an interval covering the whole array.
 * If the value of the search key is less than the item in the middle of the interval,
 * narrow the interval to the lower half. Otherwise narrow it to the upper half.
 * Repeatedly check until the value is found or the interval is empty.
 */
import java.util.Arrays;

public class BinarySearch {
    public static int iterative(int[] array, int x ){
        //x - search value
       int l = 0; // l - array left side
       int r = array.length - 1; // r - array right side
        while (l <= r) {
           int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (array[m] == x) {
                return m;
            }
            // If x greater, ignore left half
            if (array[m] < x) {
                l = m + 1;
            }
            // If x is smaller, ignore right half
           else {
                r = m - 1;
            }
        }

        // element not found return -1
        return -1;
    }

    public static int recursive(int[] array, int l , int r , int x){
        // x - search value
        // r - array left side , l- array left side
        if (r>=l){
            int mid = l + (r - l)/2;
            if (array[mid] == x) {
                // if search value equals to mid value
                return mid;
            }
            // if search value smaller than mid value
            if (array[mid] > x) {
                //search in left subarray
                return recursive(array, l, mid - 1, x);
            }
            // if search value greater than mid value
            else {
                //search in right subarray
                return recursive(array, mid + 1, r, x);
            }
        }
        // element not found return -1
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 8, 24, 33, 40 };
        Arrays.sort(arr);
        int n = arr.length - 1;
        int x = 8;
        /** call recursive binary search method */
        int result = ob.recursive(arr, 0, n , x);
        /** call iterative binary search method */
        //int result = ob.iterative(arr,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element "+ x +" found at index " + result);
    }
}
