public class Convert {
    public static final double MM_IN_INCH = 25.4;
    public static final double MM_IN_FOOT = 304.8;
    public static final double MM_IN_YARD = 914.4;
    public static final double MM_IN_MILE = 1609344;
    public static final int rounding = 2;



    public static double cm2inches(double cm ,int rounding,boolean addUnit) {

        return cm * 0.393;
    }

    public static double m2feet(double m , int rounding , boolean addUnit) {

        return m * 3.281;
    }
    public static double m2yards(double m , int rounding, boolean addUnit){

        return m * 1.094;
    }

    public static double km2miles(double km , int rounding,boolean addUnit ){

        return km * 0.621;
    }
}
