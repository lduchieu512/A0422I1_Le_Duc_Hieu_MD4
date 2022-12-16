package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "music")
@Table
public class Music {
    @Column(name = "name_song", columnDefinition = " varchar(250)")
    @Id
    private String SongName;
    private String PerformingArtist;
    private String MusicGenre;
    private String Path;

    public Music() {
    }

    public Music(String songName, String performingArtist, String musicGenre, String path) {
        SongName = songName;
        PerformingArtist = performingArtist;
        MusicGenre = musicGenre;
        Path = path;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public String getPerformingArtist() {
        return PerformingArtist;
    }

    public void setPerformingArtist(String performingArtist) {
        PerformingArtist = performingArtist;
    }

    public String getMusicGenre() {
        return MusicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        MusicGenre = musicGenre;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }
}
