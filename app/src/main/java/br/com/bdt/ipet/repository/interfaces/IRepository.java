package br.com.bdt.ipet.repository.interfaces;

import com.google.android.gms.tasks.Task;

import java.util.List;

public interface IRepository<T> {
    Task<Void> save(T t);
    List<T> findAll();
    T findById(String id);
    void delete(T t);
    void update(String id, T t);
}
