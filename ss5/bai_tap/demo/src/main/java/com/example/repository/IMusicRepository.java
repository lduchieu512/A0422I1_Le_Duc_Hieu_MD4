package com.example.repository;

import com.example.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> finAllMusic();
    void create(Music music);
    void update(Music music);
    void delete(String name);
    Music findMusicByName( String nameSong);
}
