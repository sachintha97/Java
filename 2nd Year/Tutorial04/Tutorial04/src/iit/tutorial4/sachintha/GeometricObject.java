package iit.tutorial4.sachintha;

public abstract class GeometricObject {
    protected boolean filled;
    protected String color;


    public GeometricObject() {
    }

    public GeometricObject(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getShape();

    @Override
    public String toString() {
        return "iit.tutorial4.sachintha.GeometricObject{" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
