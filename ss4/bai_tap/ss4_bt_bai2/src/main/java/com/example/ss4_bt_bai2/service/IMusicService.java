package com.example.ss4_bt_bai2.service;

import com.example.ss4_bt_bai2.models.Music;
import com.example.ss4_bt_bai2.models.MusicForm;

import java.util.List;

public interface IMusicService {
     List<Music> showAll ();
     void saveSong(Music music);
     String saveFile(MusicForm musicForm, String fileUpload);
}
