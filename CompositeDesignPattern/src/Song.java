public class Song extends SongComponent {

    String bandName;
    String songName;
    int releaseYear;

    public Song(String bandName, String songName, int releaseYear) {
        this.bandName = bandName;
        this.songName = songName;
        this.releaseYear = releaseYear;

    }

    public String getSongName() {
        return this.songName;
    }

    public String getBandName() {
        return this.bandName;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void displaySongInfo() {
        System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear());
    }


}
