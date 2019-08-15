package com.kotrkv.repositories;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    void create(T user);
    void delete(T user);
    void update(T user);
}
