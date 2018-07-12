package com.clitesol.chd.service;

import com.clitesol.chd.model.BaseModel;

import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseModel> {

    public List<T> getAll();
    public Optional<T> findOne(String id);
    public T insert(T t);
    public T update(T t);
    public T delete(String id);
}
