package com.example.service;

import com.example.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> finAllMusic();
    void create(Music music);
    void update(Music music);
    void delete(String id);
    Music findMusicByName( String nameSong);
}
