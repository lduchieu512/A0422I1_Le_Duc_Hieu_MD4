package com.example.ss4_bt_bai2.service.Impl;

import com.example.ss4_bt_bai2.models.Music;
import com.example.ss4_bt_bai2.models.MusicForm;
import com.example.ss4_bt_bai2.repository.IMusicRepository;
import com.example.ss4_bt_bai2.service.IMusicService;
import com.example.ss4_bt_bai2.validate.Validator;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service
public class MusicService implements IMusicService {
    IMusicRepository musicRepository;
    @Override
    public List<Music> showAll() {
        return musicRepository.showAll();
    }

    @Override
    public void saveSong(Music music) {
        musicRepository.saveSong(music);
    }

    @Override
    public String saveFile(MusicForm musicForm, String fileUpload) {
        MultipartFile multipartFile = musicForm.getSong();
        String fileName = multipartFile.getOriginalFilename();
        if ("".equals(fileName)){
            return fileName;
        } else if (Validator.checkFileType(fileName)) {
            musicRepository.saveFile(musicForm, fileUpload,fileName);
            return fileName;
        } else {
            fileName = "Wrong input";
            return fileName;
        }
    }
}
