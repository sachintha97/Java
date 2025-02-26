/****************************************************************************
 *  Compilation within a console or terminal:  
 *  Windows version: javac -cp .;stdlib.jar QuickUnionUF.java
 *  OS / Linux version: javac -cp .:stdlib.jar QuickUnionUF.java
 *
 *  Execution within a console or terminal:  
 *  Windows version: java -cp .;stdlib.jar QuickUnionUF < tinyUF.txt (or mediumUF.txt, or largeUF.txt)
 *  OS / Linux version: javac -cp .:stdlib.jar QuickUnionUF < tinyUF.txt (or mediumUF.txt, or largeUF.txt)
 *  Dependencies: StdIn.java StdOut.java
 *  Adaptation: Enable and disable statements where appropriately in the lines of code below.
 *
 *  NOTE for execution within an IDE (i.e., Eclipse or NetBeans): In Eclipse, drag the corresponding input data file 
 *  over the main project folder and COPY it; In NetBeans. copy-paste the .txt files into the NetBeans project
 *  directory. Accordingly, change the file name in the statement, for instance, reading data from the 
 *  tinyUF.txt file:
 *
 *  input = new Scanner(new File("tinyUF.txt"));
 *
 *  NOTE (2) for execution within an IDE: Do not forget to add the stdlib.jar to the Libraries.
 *
 *
 ****************************************************************************/

/**
 *  The <tt>QuickUnionUF</tt> class represents a union-find data structure.
 *  It supports the <em>union</em> and <em>find</em> operations, along with
 *  methods for determining whether two objects are in the same component
 *  and the total number of components.
 *  <p>
 *  This implementation uses quick union.
 *  <p>
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuickUnionUF {
    private int[] id;    // id[i] = parent of i
    private int count;   // number of components

    /**
     * Initialises an empty union-find data structure with N isolated components 0 through N-1.
     * @throws java.lang.IllegalArgumentException if N < 0
     * @param N the number of objects
     */

    public QuickUnionUF(int N) {
        id = new int[N];
        count = N;
        for (int i = 0; i <= N-1; i++) {
            id[i] = i;
        }
    }

    /**
     * Returns the number of components.
     * @return the number of components (between 1 and N)
     */

    public int count() {
        return count;
    }

    /**
     * Returns the component identifier for the component containing site <tt>p</tt>.
     * @param p the integer representing one site
     * @return the component identifier for the component containing site <tt>p</tt>
     * @throws java.lang.IndexOutOfBoundsException unless 0 <= p < N
     */

    public int find(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }

    // validate that p is a valid index
    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    /**
     * Are the two sites <tt>p</tt> and <tt>q</tt> in the same component?
     * @param p the integer representing one site
     * @param q the integer representing the other site
     * @return <tt>true</tt> if the sites <tt>p</tt> and <tt>q</tt> are in the same
     *    component, and <tt>false</tt> otherwise
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= p < N and 0 <= q < N
     */

    public boolean connected(int p, int q) {
        validate(p);
        validate(q);
        return find(p) == find(q);
    }


    /**
     * Merges the component containing site<tt>p</tt> with the component
     * containing site <tt>q</tt>.
     * @param p the integer representing one site
     * @param q the integer representing the other site
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= p < N and 0 <= q < N
     */

    public void union(int p, int q) {
        int root_P = find(p);
        int root_Q = find(q);
        if (root_P == root_Q) return;
        id[root_P] = root_Q;
        count--;
    }

    /**
     * Reads in a sequence of pairs of integers (between 0 and N-1) from standard input,
     * where each integer represents some object;
     * if the objects are in different components, merge the two components
     * and print the pair to standard output.
     */

    public static void main(String[] args) {
    	// ONLY for IDE version, remove otherwise
    	Scanner input = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name : \n 1.tinyUF.txt \n 2.mediumUF.txt \n 3.largeUF.txt");
        int userInput = scan.nextInt();
        // finding the time before operation start
        long start = System.currentTimeMillis();
        try {
            switch (userInput) {
                case (1):
                    input = new Scanner(new File("tinyUF.txt"));
                    break;
                case (2):
                    input = new Scanner(new File("mediumUF.txt"));
                    break;
                case (3):
                    input = new Scanner(new File("largeUF.txt"));
                    break;
                default:
                    System.out.println("Enter valid number");
                    System.exit(1);
            }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// END of IDE version

    	int N = input.nextInt();

    	System.out.println("Number of nodes is: " + N);
    	QuickUnionUF uf = new QuickUnionUF(N);

    	while (input.hasNextInt()) {
    		int p = input.nextInt();
    		int q = input.nextInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println();
        System.out.println(uf.count() + " components");
        // finding the time after operation end
        long end = System.currentTimeMillis();
        // finding the time difference and convert into seconds
        float elapsedTime = (end - start)/1000F;
        System.out.println();
        System.out.println("Elapsed time = " + elapsedTime + " seconds");

    }
}


