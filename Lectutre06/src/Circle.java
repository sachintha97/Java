
public class Circle {
    private double radius;
    private static int count = 0;

    public Circle(){
        count++;
    }

    public static int getCount(){
        return count;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        if(radius>0) {
            this.radius = radius;
        }
        else {
            throw new IllegalArgumentException("invalid radius...Radius has to be a positive number");
        }
    }

    public double getArea(){

        return Math.PI *this.radius *this.radius;
    }


    public double getCircumference(){

        return 2 *Math.PI *this.radius;
    }


}
