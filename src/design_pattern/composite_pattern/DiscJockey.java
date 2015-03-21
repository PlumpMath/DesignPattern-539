package design_pattern.composite_pattern;

/**
 * Created by Nianzu on 3/21/2015.
 */
public class DiscJockey {

    SongComponent songList;

    public DiscJockey(SongComponent songList){
        this.songList = songList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }

}
