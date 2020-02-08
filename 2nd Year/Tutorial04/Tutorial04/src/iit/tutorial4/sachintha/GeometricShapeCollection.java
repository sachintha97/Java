package iit.tutorial4.sachintha;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private ArrayList<GeometricObject> shapeList;
    private int numObject;

    public GeometricShapeCollection(int listLength) {
        this.numObject = listLength;
        shapeList = new ArrayList<GeometricObject>();
    }

    @Override
    public void addShape(GeometricObject shape) {

        if (shapeList.size() < numObject) {
            shapeList.add(shape);
        } else {
            System.out.println("No more space in the list");
        }
    }

    @Override
    public void printShapeList() {

        for (int i = 0; i < shapeList.size(); i++) {

            if (shapeList.get(i).getShape().equals("circle")) {
                System.out.println("Shape = Circle, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            } else if (shapeList.get(i).getShape().equals("square")) {
                System.out.println("Shape = square, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            } else if (shapeList.get(i).getShape().equals("rectangle")) {
                System.out.println("Shape = rectangle, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            } else {
                System.out.println("not valid shape");
            }
        }

    }

    @Override
    public boolean runMenu() {
        boolean exit = false;

        System.out.println("To Add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        Scanner s = new Scanner(System.in);
        int choise = s.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");
                int choise2 = s.nextInt();
                s.nextLine();
                System.out.println("Enter the color of your shape");
                String colour = s.nextLine();
                System.out.println("Is it filled? (y/n)");
                String isFilled = s.nextLine();
                boolean filled = false;
                if (isFilled.equals("y"))
                    filled = true;
                else if (isFilled.equals("n"))
                    filled = false;
                else
                    System.out.println("Please enter y or n, if the shape is filled or not respectively");
                switch (choise2) {
                    case 1:
                        // it is a circle
                        System.out.println("Insert the radius");

                        int radius = s.nextInt();
                        Circle c = new Circle(radius, filled, colour);
                        this.addShape(c);
                        break;

                    case 2:
                        // it is a circle
                        System.out.println("Insert the length");
                        System.out.println("Insert the width");

                        double length = s.nextDouble();
                        double width = s.nextDouble();
                        Rectangle r = new Rectangle(filled, colour ,length,width);
                        this.addShape(r);
                        break;

                    case 3:
                        System.out.println("Insert the side");

                        double side = s.nextDouble();

                        Square sqaure = new Square(filled, colour ,side);
                        this.addShape(sqaure);
                        break;

                }
                break;

            case 2:

                this.printShapeList();
                break;

            case 3:
                exit = true;
                break;

        }
        return exit;
    }
}