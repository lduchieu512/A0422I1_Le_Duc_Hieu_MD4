package com.example.ss5_bt_bai1.repository;

import com.example.ss5_bt_bai1.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> finAllMusic();
    void create(Music music);
    void update(Music music);
    void delete(String name);
    Music findMusicByName( String nameSong);
}
