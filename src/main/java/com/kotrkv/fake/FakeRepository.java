package com.kotrkv.fake;

import com.kotrkv.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeRepository {

    private static final FakeRepository instance = new FakeRepository();

    private List<User> users;

    private FakeRepository() {
        this.users = new ArrayList<>();
        users.add(new User("One", "passone", LocalDate.parse("1994-01-01")));
        users.add(new User("Two", "passtwo", LocalDate.parse("1995-05-05")));
    }

    public static FakeRepository getInstance() {
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }
}
