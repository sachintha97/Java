package lk.iit.Lecture1;


import lk.sachintha.lecture07.Lecture1.Heart;

public class Circle extends Object implements java.io.Serializable {

    private double radius = 0;
    private static int count = 0;
    private Heart heart;

    public Circle() {
        super(); //calling the super constructor(default constructor from the parent class)
        radius = 0.0;
        count++;
    }

    public Circle(double radius) {
        this(); // call to the default constructor the circle class
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public static int getCount(){
        return count;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
}
