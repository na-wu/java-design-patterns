public class SongListGenerator {

    public static void main(String[] args) {
        SongComponent industrial = new SongGroup("industrial", "desc 1");
        SongComponent heavyMetal = new SongGroup("Heavy Metal", "desc 2");
        SongComponent country = new SongGroup("Country", "desc 3");
        SongGroup dubstep = new SongGroup("Dubstep", "desc 4");

        SongComponent everySong = new SongGroup("Song List", "List of Every Song");

        industrial.add(dubstep);

        everySong.add(industrial);
        industrial.add(new Song("band name 1", "song name 1", 2000));
        industrial.add(new Song("band name 2", "song name 2", 2001));
        industrial.add(new Song("band name 3", "song name 3", 2002));

        everySong.displaySongInfo();
    }
}
