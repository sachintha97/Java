package iit.tutorial4.sachintha;

public class Circle extends GeometricObject {
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, boolean filled,String color) {
        super(filled, color);
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String getShape() {
        return ("circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
