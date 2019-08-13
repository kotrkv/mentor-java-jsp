package com.kotrkv.repositories;

import com.kotrkv.model.User;

import java.time.LocalDate;
import java.util.List;

public class UsersRepositoryInMemory {

    private List<User> users;

    public UsersRepositoryInMemory() {
        users.add(new User("One", "passone", LocalDate.parse("1994-01-01")));
        users.add(new User("Two", "passtwo", LocalDate.parse("1995-05-05")));
    }

    public List<User> getAll() {
        return users;
    }
}