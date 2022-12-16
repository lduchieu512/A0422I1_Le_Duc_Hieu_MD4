package com.example.ss5_bt_bai1.repository.Impl;

import com.example.ss5_bt_bai1.model.Music;
import com.example.ss5_bt_bai1.repository.IMusicRepository;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MusicRepository implements IMusicRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Music> findAllMusic() {
        List<Music> musicList = entityManager
                .createQuery("select c from Music c")
                .getResultList();
        return musicList;
    }
    @Modifying
    @Override
    public void createOrUpdate(Music music) {
        if (music.getNameSong() == null){
            entityManager.persist(music);
        }else {
            entityManager.merge(music);
        }

    }

    @Override
    public void delete(String name) {
        Music music = findMusicByName(name);
        entityManager.remove(music);
    }

    @Override
    public Music findMusicByName(String nameSong) {
        return entityManager.find(Music.class,nameSong);
    }
}
