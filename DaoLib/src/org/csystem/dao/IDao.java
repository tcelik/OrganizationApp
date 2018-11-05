package org.csystem.dao;

import java.util.List;

//CRUD ANLAŞMASI, daolar bu anlaşmaya uyarsa bunları implemente etsin lütfen.
public interface IDao<T> {
    //Generic bir tür sen ne dersen onu ekliyorum
    boolean insert(T t);

    //Senin verdiğin türden bir liste dönüyorum.
    List<T> getAll();
    boolean update(T t);
    boolean delete(T t);
}
