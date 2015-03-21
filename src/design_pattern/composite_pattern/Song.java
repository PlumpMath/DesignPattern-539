package design_pattern.composite_pattern;

/**
 * Created by Nianzu on 3/21/2015.
 */
public class Song extends SongComponent{

    String songName;
    String brandName;
    int releaseYear;

    public Song(String songName, String brandName, int releaseYear){
        this.songName = songName;
        this.brandName = brandName;
        this.releaseYear = releaseYear;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getSongName() + " was recorded by " + getBrandName() + " in " +
                getReleaseYear());
    }
}
