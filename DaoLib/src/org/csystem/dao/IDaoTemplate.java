package org.csystem.dao;

import java.util.List;

public interface IDaoTemplate<K, T> {
    //T türünden bir nesne ekliyorum ama K Türünden dönücem.
    K insert(T t);

    List<T> getAll();

    T get(K k);

    boolean update(K k, T t);
    boolean delete(K k);
}
