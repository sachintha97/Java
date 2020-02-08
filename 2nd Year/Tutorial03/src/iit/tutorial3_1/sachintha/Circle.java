package iit.tutorial3_1.sachintha;

public class Circle {
    // private instance variables, not accessible from outside the class
    private String colour;
    private double radius;

    // default contsructor with no arguments
    public Circle(){
        radius = 1;
        colour = "Blue";
    }

    // second constructor takes as argument the radius but has default colour
    public Circle(double r){
        radius = r;
        colour = "Blue";
    }

    // third constructor takes as argument the radius and the colour
    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    // public method to retrive the radius
    public double getRadius(){
        return radius;
    }

    // public method to compute and return the area of circle
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String toString(){
        return  "Radius = " + radius + " and Color = " + colour;
    }


}



