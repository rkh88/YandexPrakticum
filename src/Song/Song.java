package Song;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object object){

        if (this == null || object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Song song = (Song) object;

        if(Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && Objects.equals(songwriter, song.songwriter)) {
            return true;
        } else {
            return false;
        }
    }
}

