package Collection_API_practice;

import java.util.Comparator;
import java.util.Objects;

public class Song_Set implements Comparable<Song_Set> {

    String title;
    String artist;
    String rating;
    String bpm;
    
    //for Set.. we need to override hashSet() and equals() method.

    @Override
    public int hashCode() {
        return title.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        final Song_Set s = (Song_Set) obj;
        return getTitle().equals(s.getTitle());
    }
    
    public Song_Set(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    @Override
    public int compareTo(Song_Set s) {
        return title.compareTo(s.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return title;
    }

}
