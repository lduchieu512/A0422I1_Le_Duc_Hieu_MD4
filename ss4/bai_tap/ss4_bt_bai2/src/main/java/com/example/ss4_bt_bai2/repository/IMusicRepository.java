package com.example.ss4_bt_bai2.repository;

import com.example.ss4_bt_bai2.models.Music;
import com.example.ss4_bt_bai2.models.MusicForm;

import java.util.List;

public interface IMusicRepository {
     List<Music> showAll ();
     void saveSong(Music music);
     void saveFile(MusicForm musicForm, String fileUpload, String fileName);
}
