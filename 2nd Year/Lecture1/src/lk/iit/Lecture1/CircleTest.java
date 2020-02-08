package lk.iit.Lecture1;

public class CircleTest {
    public static void main(String[] args){
        Circle obj1 = new Circle();
        Circle obj2 = new Circle(25.5);

        System.out.println("The area of the circle is " + obj1.getArea());
        System.out.println("The area of the other circle is " + obj2.getArea());
    }
}
