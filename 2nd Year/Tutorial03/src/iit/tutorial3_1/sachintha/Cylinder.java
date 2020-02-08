package iit.tutorial3_1.sachintha;

public class Cylinder extends Circle {
    private double height;

    //	Constructor	with	default	color,	radius	and	height
    public Cylinder(){
        super();
        height = 1.0;
    }


    // Constructor	with	default	radius,	color	but	given	height
    public Cylinder(double height){
        super();
        this.height = height;
    }

    //	Constructor	with	default	color,	but	given	radius,	height
    public Cylinder(double radius , double height){
        super(radius);
        this.height = height;
    }

    //	A public	method	for	retrieving	the	height
    public double getHeight() {
        return height;
    }

    // A public method calculate and return to cylinder area
    public double getArea(){
        return (2*Math.PI*getRadius()*height)+(2*super.getArea());
    }

    //	A public method	for	computing the volume of	cylinder
    // use superclass method getArea() to get the base area
    public double getVolume(){
        double volume = super.getArea()*height;
        return volume;
    }

    //	in	Cylinder	class
    @Override
    public	String	toString()	{
        return	"Cylinder:	subclass	of	"	+	super.toString()
                +	"	height = "	+	height;
    }
}

