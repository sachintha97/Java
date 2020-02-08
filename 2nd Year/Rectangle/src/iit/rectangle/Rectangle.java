package iit.rectangle;

public class Rectangle {
    private static double length;
    private static double width;

    Rectangle(double l , double w){
        length = l;
        width = w;
    }

    Rectangle(double n){
        this.setLength(n);
        this.setWidth(n);

    }

    public void setLength( double length) {
        if (length > 0) {
            this.length = length;
        }
        else {
            throw new IllegalArgumentException("invalid value for the length has to be greater than zero");
        }

    }

    public double getLength() {
        return length;
    }

    public void setWidth( double width) {
        if (width > 0) {
            this.width = width;
        }
        else {
            throw new IllegalArgumentException("invalid value for the width has to be greater than zero");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return (this.length * this.width);
    }

    public double getPerimeter(){
        return 2 *(this.length + this.width);
    }

    public boolean isSquare(){
        return (this.length == this.width);
    }

    public static boolean isSquare(Rectangle rectangle){
        return rectangle.isSquare();
    }

    public static double getAreaDifference(Rectangle rectangle1 , Rectangle rectangle2){
        return (rectangle2.getArea()-rectangle1.getArea());
    }

    public static Rectangle checkHighest(Rectangle rect1,Rectangle rect2){
        if (rect1.getArea() > rect2.getArea()){
            return rect1;
        }
        else if (rect2.getArea() > rect1.getArea()){
            return rect2;
        }
        return null;
    }

}
