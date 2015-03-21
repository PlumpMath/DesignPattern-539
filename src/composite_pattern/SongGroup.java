package composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Nianzu on 3/21/2015.
 */
public class SongGroup extends SongComponent{

    ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();

    String groupName;
    String groupDescription;

    public SongGroup(String groupName, String groupDescription){
        this.groupDescription = groupDescription;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    // the parameter is SongComponent, so that it could add both SongGroup and Song
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

    @Override
    public SongComponent getComponent(int componentIndex) {
        return songComponents.get(componentIndex);
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getGroupName() + " -- " + getGroupDescription() + "\n");

        //display all the song list
        Iterator songListIterator = songComponents.iterator();
        while(songListIterator.hasNext()){
            SongComponent songInfo = (SongComponent) songListIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
