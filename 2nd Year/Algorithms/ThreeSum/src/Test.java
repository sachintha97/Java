import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static sun.java2d.cmm.ColorTransform.In;

public class Test {

    public static int sum(int[]a){
        int count =0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                for(int k=j+1; k<a.length; k++){
                  if(a[i]+a[j]+a[k]==0){
                      System.out.println("i = "+a[i]+" j =" + a[j] + " k = " + a[k]);
                      count++;
                  }
                }
            }
        }
        return count;
    }
    public static void readreport() throws FileNotFoundException {
        // file path
        //File file = new File("test.txt");
        FileReader fr=new FileReader("test.txt");

        try {
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char) i);
            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {

        int[] a ={30,-40,-20,-10,40,0,10,5};
        readreport();
        //System.out.println(sum(a));



    }
}
