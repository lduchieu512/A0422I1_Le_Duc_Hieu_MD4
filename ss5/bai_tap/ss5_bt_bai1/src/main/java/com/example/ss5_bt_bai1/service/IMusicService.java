package com.example.ss5_bt_bai1.service;

import com.example.ss5_bt_bai1.model.Music;

import java.nio.channels.MulticastChannel;
import java.util.List;

public interface IMusicService {
    List<Music> findAllMusic();
    void createOrUpdate(Music music);
    void delete(String name);
    Music findByName(String nameSong);
}
