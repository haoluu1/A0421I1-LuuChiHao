package codegym.service;

import codegym.model.Music;
import codegym.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService{
    private IMusicRepository iMusicRepository;
    @Autowired
    public MusicService(IMusicRepository iMusicRepository){
        this.iMusicRepository = iMusicRepository;
    }
    @Override
    public void create(Music music) {
        iMusicRepository.create(music);
    }

    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void update(Music music) {
        iMusicRepository.update(music);
    }

    @Override
    public Music findById(int id) {
        return iMusicRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        iMusicRepository.delete(id);
    }
}
