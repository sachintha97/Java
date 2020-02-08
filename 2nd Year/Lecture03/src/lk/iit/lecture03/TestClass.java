package lk.iit.lecture03;

public class TestClass {
    public static void main(String[] args) {
        Person obj = new Student("sachintha","Amarasiri","2nd june","071236","kottawa" ,
                "sachi@gmail.com","w171","SE");

        Student obj1 = new Student("Hasani","Dilhari","8th august","078936","nittambuwa" ,
                "Hasi@gmail.com","w1718","SE");

        print(obj);
        print(obj1);
    }

    public static void print(Person obj){
        System.out.println(obj.toString());
    }
}
