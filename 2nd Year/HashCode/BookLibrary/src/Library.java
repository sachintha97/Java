import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Library {
    int b; // number of books
    int l;  //number of libraries
    int d;  //number of days

    public static void main(String[] args) {

        int i =0;
        HashMap<Integer, String> mapHash = new HashMap<Integer, String>();

        try (BufferedReader br = new BufferedReader(new FileReader("a_example.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("a_example_result.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                //store the lexicon with position in the hashmap
                mapHash.put(i, line);
                i++;
                String[] values = line.split(" ");
                if (values.length >= 6)
                System.out.println(values[1]);
                bw.write(values[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
