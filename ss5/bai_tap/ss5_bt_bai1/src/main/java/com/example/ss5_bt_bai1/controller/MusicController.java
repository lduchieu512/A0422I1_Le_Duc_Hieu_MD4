package com.example.ss5_bt_bai1.controller;

import com.example.ss5_bt_bai1.model.Music;
import com.example.ss5_bt_bai1.model.MusicForm;
import com.example.ss5_bt_bai1.service.IMusicService;
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

    @ModelAttribute("music")
    public Music initMusic(){return new Music();}

    @ModelAttribute("musicForm")
    public MusicForm initMusicForm(){return new MusicForm();}


    @GetMapping("")
    public String display(Model model){
        List<Music> musicList = musicService.findAllMusic();
        model.addAttribute("musicList",musicList);
        return "list";
    }

}
