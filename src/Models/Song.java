package Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Song
{
    private final SimpleIntegerProperty songId;
    private final SimpleStringProperty title;
    private final SimpleDoubleProperty length;
    private final SimpleIntegerProperty genreId;
    private final SimpleIntegerProperty albumId;

    public Song(int songId, String title, Double length, int genreId, int albumId)
    {
        this.songId = new SimpleIntegerProperty(songId);
        this.title = new SimpleStringProperty(title);
        this.length = new SimpleDoubleProperty(length);
        this.genreId = new SimpleIntegerProperty(genreId);
        this.albumId = new SimpleIntegerProperty(albumId);
    }
    public int getSongId(){ return songId.get();}
    public void setSongId(int songId){ this.songId.set(songId);}

    public String getTitle(){ return title.get();}
    public void setTitle(String title){ this.title.set(title);}

    public double getLength(){ return length.get();}
    public void setLength(double length){ this.length.set(length);}

    public int getGenreId(){ return genreId.get();}
    public void setGenreId(int genreId){ this.genreId.set(genreId);}

    public int getAlbumId(){ return albumId.get();}
    public void setAlbumId(int albumId){ this.albumId.set(albumId);}

}
