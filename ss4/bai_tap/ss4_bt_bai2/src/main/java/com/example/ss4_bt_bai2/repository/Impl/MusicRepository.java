package com.example.ss4_bt_bai2.repository.Impl;

import com.example.ss4_bt_bai2.models.Music;
import com.example.ss4_bt_bai2.models.MusicForm;
import com.example.ss4_bt_bai2.repository.IMusicRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository {
    private List<Music> musicList = new ArrayList<>();

    @Override
    public List<Music> showAll() {
        return musicList;
    }

    @Override
    public void saveSong(Music music) {
        musicList.add(music);
    }

    @Override
    public void saveFile(MusicForm musicForm, String fileUpload, String fileName) {
        try {
            FileCopyUtils.copy(musicForm.getSong().getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
