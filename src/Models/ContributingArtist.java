package Models;

public class ContributingArtist {
    private int artistId;
    private int albumId;

    public ContributingArtist(int artistId, int albumId) {
        this.artistId = artistId;
        this.albumId = albumId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
}
