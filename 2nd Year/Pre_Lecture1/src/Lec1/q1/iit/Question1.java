package Lec1.q1.iit;

public class Question1 {
    public static void main(String[] args){
        Address obj1 = new Address( 27/3 , "jayamawatha" ,11, "kottawa" , "sri lanka",1022);
        Address obj2 = new Address( 27 , "jaya" ,12, "nugegoda" , "sri lanka",102);
        obj1.printAddress();

        boolean x = obj1.comesBefore(obj2);
        System.out.println(x);
    }
}
