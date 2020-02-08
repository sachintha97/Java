package lk.sachintha.casestudy.pojo;

public abstract class MusicItem  implements Comparable<MusicItem>{
    private String itemID;
    private String title;
    private String genre;
    private String releaseDate;
    private String artist;
    private double price;

    public MusicItem(String itemID, String title, String genre, String releaseDate, String artist, double price) {
        this.itemID = itemID;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.artist = artist;
        this.price = price;
    }


    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "lk.sachintha.casestudy.pojo.MusicItem{" +
                "itemID='" + itemID + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                ", Artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicItem)) return false;

        MusicItem musicItem = (MusicItem) o;

        if (Double.compare(musicItem.price, price) != 0) return false;
        if (itemID != null ? !itemID.equals(musicItem.itemID) : musicItem.itemID != null) return false;
        if (title != null ? !title.equals(musicItem.title) : musicItem.title != null) return false;
        if (genre != null ? !genre.equals(musicItem.genre) : musicItem.genre != null) return false;
        if (releaseDate != null ? !releaseDate.equals(musicItem.releaseDate) : musicItem.releaseDate != null)
            return false;
        return artist != null ? artist.equals(musicItem.artist) : musicItem.artist == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = itemID != null ? itemID.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(MusicItem o) {

        return this.getTitle().compareTo(o.getTitle());
    }
}