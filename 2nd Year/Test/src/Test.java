import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "wow";
        String b = "";
        for(int i = a.length() -1; i >= 0; i--){
            b = b + a.charAt(i);
        }

        if(a.equals(b)) {
            System.out.println("it is Palindrome word");
            System.out.println(b);
        }
        else {
            System.out.println("it is not Palindrome word");
            System.out.println(b);
        }
    }
//public static void main(String[] args) {
//    int [] array= {3 , 4, 5, 6, 7};
//    int [] array2 = new int[5];
//
//    int j =0;
//    for (int i = array.length-1; i >=0 ; i--) {
//            array2[j] = array[i];
//            j++;
//
//    }
//    //int y = array[array.length-1];
//    System.out.println(Arrays.toString(array2));
//    //System.out.println(y);
//    }
}
