import java.util.Scanner;
import java.lang.*;

class Main {
    private static int b, x, t;

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int u = 0; u < t; u++) {
            System.out.println(u);
            b = in.nextInt();
            x = in.nextInt();
            int n = 26;
            String index = "";
            String index1;


            for (int i = 0; i < n * n; ++i) {
                index += str(i);
            }


            index1 = index.toLowerCase();
            char ch1 = index1.charAt(x);
            System.out.println(ch1);
        }
        System.exit(0);

    }

    public static String str(int i) {
        return i < 0 ? "" : str((i / b) - 1) + (char) (65 + i % b);
    }

}

