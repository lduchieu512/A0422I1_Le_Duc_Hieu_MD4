package com.example.ss5_bt_bai1.repository.Impl;

import com.example.ss5_bt_bai1.model.Music;
import com.example.ss5_bt_bai1.repository.IMusicRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MusicRepositoryImpl implements IMusicRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Music> finAllMusic() {
        List<Music> musicList = entityManager
                .createQuery("select m from Music m")
                .getResultList();
        return musicList;
    }
    @Modifying
    @Override
    public void create(Music music) {
        if(music.getSongName() == null){
            entityManager.persist(music);
        }else {
            entityManager.merge(music);
        }
    }
    @Modifying
    @Override
    public void update(Music music) {

    }
    @Modifying
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
