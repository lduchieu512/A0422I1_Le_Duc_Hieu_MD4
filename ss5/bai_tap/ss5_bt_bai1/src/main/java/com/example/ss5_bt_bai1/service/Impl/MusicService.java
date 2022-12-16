package com.example.ss5_bt_bai1.service.Impl;

import com.example.ss5_bt_bai1.model.Music;
import com.example.ss5_bt_bai1.repository.IMusicRepository;
import com.example.ss5_bt_bai1.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    IMusicRepository musicRepository;


    @Override
    public List<Music> findAllMusic() {
        return musicRepository.findAllMusic();
    }

    @Override
    public void createOrUpdate(Music music) {
        musicRepository.createOrUpdate(music);
    }

    @Override
    public void delete(String name) {
        musicRepository.delete(name);
    }

    @Override
    public Music findByName(String nameSong) {
        return musicRepository.findMusicByName(nameSong);
    }
}
