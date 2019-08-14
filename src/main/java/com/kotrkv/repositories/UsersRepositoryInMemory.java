package com.kotrkv.repositories;

import com.kotrkv.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemory implements Repository<User> {

    private List<User> users = new ArrayList<>();

    public UsersRepositoryInMemory() {
        users.add(new User("One", "passone", LocalDate.parse("1994-01-01")));
        users.add(new User("Two", "passtwo", LocalDate.parse("1995-05-05")));
    }

    public List<User> findAll() {
        return users;
    }

    @Override
    public void create(User user) {
        users.add(user);
    }
}
