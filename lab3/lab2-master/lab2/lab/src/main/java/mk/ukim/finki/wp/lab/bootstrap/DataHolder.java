package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Artist> artists = null;
    public static List<Song> songs = null;

    public static List<Album> albums = null;

    /*@PostConstruct
    public void init(){
        artists = new ArrayList<>();
        artists.add(new Artist(1234L, "John", "Johnson", "Artist1-bio"));
        artists.add(new Artist(1235L, "Rico", "Riconson", "Artist2-bio"));
        artists.add(new Artist(1236L, "Michael", "Michaelson", "Artist3-bio"));
        artists.add(new Artist(1237L, "Willy", "William", "Artist4-bio"));
        artists.add(new Artist(1238L, "Thomas", "Thomason", "Artist5-bio"));

        albums = new ArrayList<>();
        albums.add(new Album("album 1", "rock", "2019"));
        albums.add(new Album("album 2", "pop", "2020"));
        albums.add(new Album("album 3", "jazz", "2021"));
        albums.add(new Album("album 4", "metal", "2022"));
        albums.add(new Album("album 5", "rock", "2023"));

        songs = new ArrayList<>();
        songs.add(new Song("Song of the Sky", "Pop", 2020, albums.get(0)));
        songs.add(new Song("Rhythm of the Night", "Dance", 2019, albums.get(2)));
        songs.add(new Song("Echoes of Silence", "Rock", 2018, albums.get(3)));
        songs.add(new Song("Golden Dreams", "Country", 2021, albums.get(4)));
        songs.add(new Song("Electric Heartbeat", "Electronic", 2022, albums.get(1)));

    }*/
}
