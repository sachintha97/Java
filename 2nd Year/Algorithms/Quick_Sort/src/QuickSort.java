public class QuickSort {

        /* takes last element as pivot, places the pivot element at its correct
        position in sorted array, and places all smaller (smaller than pivot) to left of
        pivot and all greater elements to right of pivot */
        public int partition(int arr[], int low, int high)
        {
            int pivot = arr[high];
            // index of smaller element
            int i = (low-1);
            for (int j=low; j<high; j++)
            {
                //if current element is smaller than the pivot
                if (arr[j] < pivot)
                {
                    i++;

                    //swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            //swap arr[i+1] and arr[high] (or pivot)
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;

            return i+1;
        }


        /* the main function that implements QuickSort()
        arr[] = array to be sorted */
        public void sort(int arr[], int low, int high)
        {
            //starting index < ending index
            if (low < high)
            {
			/* pi is partitioning index, arr[pi] is
			now at right place */
                int pi = partition(arr, low, high);

                // recursively sort elements before
                // partition and after partition
                sort(arr, low, pi-1);
                sort(arr, pi+1, high);
            }
        }

        //a utility function to print array of size n
        public static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

        public static void main(String args[])
        {
            int arr[] = {10, 7, 33, 9, 1, 47 , 14 , 29};
            int n = arr.length;

            System.out.print("Given Array : ");
            printArray(arr);

            QuickSort ob = new QuickSort();
            ob.sort(arr, 0, n-1);

            System.out.print("\nSorted Array : ");
            printArray(arr);
        }

}
