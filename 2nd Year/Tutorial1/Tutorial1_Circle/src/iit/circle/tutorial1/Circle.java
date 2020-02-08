package iit.circle.tutorial1;

public class Circle {
    private String color;
    private double radius;

    // default constructor
    public Circle(){
        radius = 1;
        color = "Blue";
    }
    // Constructor of the circle class with one parameter
    public Circle(double radius){
        this.radius = radius;
        color = "Blue";
    }

    // Constructor of the circle class with two parameter
    public Circle(double radius, String color){
        this.radius = radius;
        this.color =color;
    }

    public double getRadius(){
        return radius;
    }

    // Calculate circle area
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColour(String color){
        this.color = color;
    }
}
