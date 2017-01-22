package dao;

import java.util.Map;

public interface Home<T> {

    void insert(T nouveau);

    boolean delete(int id);

    T findById(int id);

    boolean upDate(T a);

    Map<Integer, T> findAll();
}
