package com.example.controller;

import com.example.model.Music;
import com.example.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@PropertySource("classpath:music.properties")
@RequestMapping("/music")
public class MusicController {
    @Value("${file-upload}")
    private String fileUpload;

    @Autowired
    IMusicService musicService;

//    @ModelAttribute("musicForm")
//    public MusicForm initMusicForm() {
//        return new MusicForm();
//    }
//
    @ModelAttribute("music")
    public Music initMusic() {
        return new Music();
    }
    @GetMapping("")
    public String display(Model model){
        List<Music> musicList = musicService.finAllMusic();
        model.addAttribute("musicList",musicList);
        return "list";
    }



}
