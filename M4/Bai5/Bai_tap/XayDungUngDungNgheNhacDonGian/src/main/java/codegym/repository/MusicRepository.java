package codegym.repository;

import codegym.model.Music;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class MusicRepository implements IMusicRepository{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(Music music) {
        entityManager.persist(music);
    }

    @Override
    public List<Music> findAll() {
        return entityManager.createQuery("Select s from Music s").getResultList();
    }

    @Override
    public void update(Music music) {
        entityManager.merge(music);
    }

    @Override
    public Music findById(int id) {
        return entityManager.find(Music.class, id);
    }

    @Override
    public void delete(int id) {
        Music music = findById(id);
        entityManager.remove(music);
    }
}
