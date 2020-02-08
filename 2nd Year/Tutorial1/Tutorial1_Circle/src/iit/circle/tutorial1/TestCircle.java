package iit.circle.tutorial1;

public class TestCircle {

    public static void main(String[] args) {
        // Declare an instance of Circle class called circle1
        // Invoke the default constructor
        Circle circle1 = new Circle();

        // invoke public methods
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        //declare an instance of Circle class called circle2
        // invoke the second constructor
        Circle circle2 = new Circle(8);

        // invoke public methods
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());


        //declare an instance of Circle class called circle3
        // invoke the third constructor
        Circle circle3 = new Circle(10,"green");

        System.out.println("The circle has radius of " + circle3.getRadius() + " and color of " + circle3.getColor());


        System.out.println(circle3.toString());
        System.out.println(circle3);
    }
}
