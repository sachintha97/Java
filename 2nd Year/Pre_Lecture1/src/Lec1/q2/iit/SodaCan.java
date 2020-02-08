package Lec1.q2.iit;

public class SodaCan {
    double height; //height of can
    double radius; //radius of can

    //constructor of the class SodaCane
    public SodaCan(double radius , double height){
        this.radius = radius;
        this.height = height;
    }

    // Calculate surface area
    public double getSurfaceArea() {
        return (Math.round(2 * Math.PI * this.radius) * (this.radius + this.height)); //surface area = 2πr(r+h)

    }

    // Calculate volume
    public double getVolume(){
        return (Math.round(Math.PI * this.radius * this.radius * this.height)); // volume = πrrh

    }

}

