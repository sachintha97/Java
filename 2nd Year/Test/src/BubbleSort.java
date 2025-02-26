import java.util.Arrays;

// Java program for implementation of Bubble Sort
class BubbleSort
{
    void bubbleSort(int arr[]) {
        int n = arr.length;
        // i<6
        for (int i = 0; i < n - 1; i++) {
            // j< 7-i-1
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
//    void printArray(int arr[])
//    {
//        int n = arr.length;
//        for (int i=0; i<n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Bubble Sorted array" + Arrays.toString(arr));
        //ob.printArray(arr);
    }
}
