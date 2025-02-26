/**
 *  The <tt>ThreeSum</tt> class provides static methods for counting
 *  and printing the number of triples in an array of integers that sum to 0
 *  (ignoring integer overflow).
 *
 *  IDE specific configuration setting to input the data:
 *
 *  For Eclipse: Select "Run configurations..." from the drop-down menu "Run", click on tab "(x)=Arguments" and
 *  (a) type in the name of the file, e.g., 1Kints.txt, into the text field "Program arguments:",
 *  (b) select the working directory at the bottom where the file resides
 *
 *  For NetBeans: Right mouse click on the application main folder, select the option
 *  "Set Configuration" and "Customize..." from the drop-down menu. Subsequently, type in and select
 *  the file name and the working directory, respectively.
 *
 */

public class ThreeSum {

    /**
     * Prints to standard output the (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0.
     * @param a the array of integers
     */

    public static void printAll(int[] a) {
        int n = a.length;
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                for (int k = j+1; k <n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                    }

                }

            }

        }

    }

    /**
     * Returns the number of triples (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0.
     * @param a the array of integers
     * @return the number of triples (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0
     */

    public static int count(int[] a) {

        int n = a.length;
        int count=0;
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                for (int k = j+1; k <n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }

                }

            }

        }
        return count;
    }

    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     */

    public static void main(String[] args)  {

        In in = new In(args[0]);
        int[] a = in.readAllInts();

        Stopwatch timer = new Stopwatch();
        int count = count(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);
    }
}