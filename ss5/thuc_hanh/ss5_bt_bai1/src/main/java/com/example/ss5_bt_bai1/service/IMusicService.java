package com.example.ss5_bt_bai1.service;

import com.example.ss5_bt_bai1.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> finAllMusic();
    void create(Music music);
    void update(Music music);
    void delete(String id);
    Music findMusicByName( String nameSong);
}
