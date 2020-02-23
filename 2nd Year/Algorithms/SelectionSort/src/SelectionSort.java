/**Array of integers that should be sorted from smallest to large.
(Repeatedly selected the smallest element, and moved this element to the front of the unsorted side.)*/

public class SelectionSort {
    // sort the array using selection sort
    public void sortArray (int array[]){
        int n = array.length;
        //First Iterate through the array and finding the smallest entry
        for (int i = 0; i <n-1 ; i++) {
            // Find smallest entry in unsorted array
            int minimumValue = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minimumValue]) {
                    minimumValue = j;
                }

            }

            //Swap the smallest entry with the first entry
            int m = array[minimumValue];
            array[minimumValue] = array[i];
            array[i] = m;
        }
    }

    // print array
    public void printArray(int array[]){
        int n = array.length;
        for (int i = 0; i <n ; ++i) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] array1 = {4,9,54,18,32,90,1};
        SelectionSort obj = new SelectionSort();
        obj.sortArray(array1);
        System.out.println("Selection Sorted Array : ");
        obj.printArray(array1);
    }
}
