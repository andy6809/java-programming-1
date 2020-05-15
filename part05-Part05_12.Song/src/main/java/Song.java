
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object otherSong) {
        if (this == otherSong) {
            return true;
        }
        
        if (!(otherSong instanceof Song)) {
            return false;
        }
        
        Song comparedSong = (Song) otherSong;
        if (this.name.equals(comparedSong.name) &&
            this.artist.equals(comparedSong.artist) &&
            this.durationInSeconds == comparedSong.durationInSeconds) {
                return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
