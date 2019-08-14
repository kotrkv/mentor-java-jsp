package com.kotrkv.repositories;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    void create(T user);
}
