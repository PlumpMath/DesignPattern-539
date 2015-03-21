package design_pattern.composite_pattern;

/**
 * Created by Nianzu on 3/21/2015.
 */
public abstract class SongComponent {

    public void add(SongComponent newSongComponent){

        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent newSongComponent){

        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int componentIndex){

        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName(){
        throw new UnsupportedOperationException();
    }

    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }

}
