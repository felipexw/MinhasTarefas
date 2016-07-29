package br.appio.minhastarefas.repository;

import java.util.List;

/**
 * Created by Appio on 28/07/2016.
 */
public interface Repository<T> {
    List<T> getAll();

    T getById(long id);

    long create(T entity);

    long update(T entity);

    boolean delete(long id);
}
