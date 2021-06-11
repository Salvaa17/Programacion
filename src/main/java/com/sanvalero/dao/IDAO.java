package com.sanvalero.dao;

import java.util.List;

public interface IDAO <T>{
    public List<T> getAll();
    public T getById(int id);
    public void create (T t);
    public void delete (int id);
    public void update (T t);
}
