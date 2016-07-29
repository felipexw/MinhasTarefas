package br.appio.minhastarefas.repository;

import com.activeandroid.Model;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by Appio on 28/07/2016.
 */
public class RepositoryImpl<T extends Model> implements Repository<T> {
    protected Class clazz;

    public RepositoryImpl(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public List<T> getAll() {
        return new Select().from(clazz).execute();
    }

    @Override
    public T getById(long id) {
        return new Select().from(clazz).where("id=?", id).executeSingle();
    }

    @Override
    public long create(T entity) {
        return entity.save();
    }

    @Override
    public long update(T entity) {
    return entity.save();
    }

    @Override
    public boolean delete(long id) {
        try {
            new Delete().from(clazz).where("Id=?", id).executeSingle();
            return true;
        } catch (Exception ignored) {
            ignored.printStackTrace();
            return false;
        }
    }
}
