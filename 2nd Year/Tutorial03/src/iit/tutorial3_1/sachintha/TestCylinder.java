package iit.tutorial3_1.sachintha;

public class TestCylinder {
    public static void main(String[] args) {

        // Declare and allocate	a new instance of cylinder
        Cylinder c1 = new Cylinder();

        System.out.println("Cylinder:" + " radius = " + c1.getRadius()
                + " height = " + c1.getHeight() + " base area = "
                + c1.getArea() + " volume = " + c1.getVolume());

        //	Declare	and	allocatea new instance of cylinder, specifying Height
        Cylinder c2 = new Cylinder(5.0);

        System.out.println("Cylinder:" + " radius = " + c2.getRadius()
                + " height = " + c2.getHeight() + " base area = "
                + c2.getArea() + " volume = " + c2.getVolume());

        //	Declare	and	allocatea new instance of cylinder, specifying Height and height
        Cylinder c3 = new Cylinder(5.0,	10.0);

        System.out.println("Cylinder:" + " radius = " + c3.getRadius()
                + " height = " + c3.getHeight() + " base area = "
                + c3.getArea() + " volume = " + c3.getVolume());

        // Declare and allocate	a new instance of circle
        Circle c4 = new Circle();

        System.out.println("c4 Circle Area = "+c4.getArea());

        // Declare and allocate	a new instance of cylinder
        Cylinder c5 = new Cylinder();

        System.out.println("c5 Cylinder Area = "+c5.getArea());

        System.out.println(c5.toString());
    }
}

