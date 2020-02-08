package lk.sachintha.casestudy.pojo;

import java.util.Objects;

public class CD extends MusicItem {
    //duration calculate in second
    private int duration;

    public CD(String itemID, String title, String genre, String releaseDate, String artist, double price, int duration) {
        super(itemID, title, genre, releaseDate, artist, price);
        this.duration = duration;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CD))
            return false;
        if (!super.equals(obj))
            return false;
        CD cd = (CD) obj;
        return duration == cd.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }

    @Override
    public String toString() {
        return "CD{"  + super.toString() +
                "duration=" + duration +
                "} ";
    }
}
