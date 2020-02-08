package lk.sachintha.lecture07;

import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

public class CharacterStream {
    public static void main(String[] args) throws IOException {

        File file = new File("Product.txt");
        //code below is to demostrate
        FileWriter fw=null;
        PrintWriter pw =null;

        try {
            //open file
            fw = new FileWriter(file,true); // second parameter is an append
            pw = new PrintWriter(fw,true);// second parameter is an autoflush
            //write file
            pw.println("Sachintha");
            pw.println(22);
        }

        catch (IOException e){
            System.err.println("Error occurred " + e.getMessage());
        }
        finally {
            try {
                //close file
                fw.close();
                pw.close();
            }
            catch (IOException e){
                System.err.println("Error occurred " + e.getMessage());
            }
        }

        //code below is to demonstrate steps in reading from the title
            Scanner scan =new Scanner(file);
//            while (scan.hasNextLine()) {
//                try {
//                    String name = scan.nextLine();
//                    System.out.println("The name is: " + name);
//                    int age = Integer.parseInt(scan.nextLine());
//                    System.out.println("The age is: " + age);
//
//                } catch (Exception e) { //child come first
//
//                }
//            }

//        catch (IOException e){ // parent
//            e.printStackTrace();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        catch (Throwable e){ //super parent come last
//            e.printStackTrace();
//        }

// using buffered reader
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine())!= null){
                System.out.println("The name is: " + line );
                int age = Integer.parseInt(br.readLine());
                System.out.println("age: " + age);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
