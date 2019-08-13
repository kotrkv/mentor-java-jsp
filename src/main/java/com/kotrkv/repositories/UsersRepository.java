package com.kotrkv.repositories;

import java.util.List;

public interface UsersRepository<T> {
    List<T> findAll();
}
