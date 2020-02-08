package iit.tutorial1.myapplication;

public class MyApplication {


    public static void main(String[] args) {

        Person obj = new Person("Ben");
        obj.displayName();

        Person obj1 = new Person("michel","Perera",27);
        Person obj2 = new Person("Harry","Fernando",26);
        Person obj3 = new Person("Rony","Peiris",28);

        obj1.printDetails();
        obj2.printDetails();
        obj3.printDetails();
    }



        

}
