import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDesc;

    public SongGroup(String groupName, String groupDesc) {
        this.groupName = groupName;
        this.groupDesc = groupDesc;


    }

    public String getGroupName() {
        return this.groupName;
    }
    public String getGroupDesc() {
        return this.groupDesc;
    }
    public void add(SongComponent component) {
        songComponents.add(component);
    }

    public void remove(SongComponent component) {
        songComponents.remove(component);
    }

    @Override
    public SongComponent getComponent(int componentIndex) {
        return super.getComponent(componentIndex);
    }

    public void displaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDesc() + "\n");

        Iterator songIterator = songComponents.iterator();

        while(songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }


}

