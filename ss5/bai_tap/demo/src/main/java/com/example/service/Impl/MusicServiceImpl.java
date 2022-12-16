package com.example.service.Impl;


import com.example.model.Music;
import com.example.repository.IMusicRepository;
import com.example.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService {
    @Autowired
    IMusicRepository musicRepository;
    @Override
    public List<Music> finAllMusic() {
        return musicRepository.finAllMusic();
    }

    @Override
    public void create(Music music) {
        musicRepository.create(music);
    }

    @Override
    public void update(Music music) {
        musicRepository.update(music);
    }

    @Override
    public void delete(String id) {
        musicRepository.delete(id);
    }

    @Override
    public Music findMusicByName(String nameSong) {
        return musicRepository.findMusicByName(nameSong);
    }
}
