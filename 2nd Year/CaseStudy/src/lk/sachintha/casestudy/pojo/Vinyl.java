package lk.sachintha.casestudy.pojo;

import java.util.Objects;

public class Vinyl extends MusicItem {

    private double speed;
    private double diameter;

    public Vinyl(String itemID, String title, String genre, String releaseDate, String artist, double price) {
        super(itemID, title, genre, releaseDate, artist, price);
    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Vinyl))
            return false;
        if (!super.equals(o))
            return false;
        Vinyl vinyl = (Vinyl) o;
        return Double.compare(vinyl.speed, speed) == 0 &&
                Double.compare(vinyl.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, diameter);
    }
}
