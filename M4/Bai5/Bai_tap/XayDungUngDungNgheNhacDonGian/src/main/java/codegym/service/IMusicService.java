package codegym.service;

import codegym.model.Music;

import java.util.List;

public interface IMusicService {
    void create(Music music);

    List<Music> findAll();

    void update(Music music);

    Music findById(int id);

    void delete(int id);
}
