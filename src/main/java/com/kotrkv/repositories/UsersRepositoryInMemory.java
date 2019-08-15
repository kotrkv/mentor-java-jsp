package com.kotrkv.repositories;

import com.kotrkv.fake.FakeRepository;
import com.kotrkv.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemory implements Repository<User> {

//    private List<User> users = new ArrayList<>();

    public UsersRepositoryInMemory() {
    }

    public List<User> findAll() {
        return FakeRepository.getInstance().getUsers();
    }

    @Override
    public void create(User user) {
        FakeRepository.getInstance().getUsers().add(user);
    }

    @Override
    public void delete(User user) {
        FakeRepository.getInstance().getUsers().remove(user);
    }

    @Override
    public void update(User user) {
        FakeRepository.getInstance().getUsers().set(1, user);
    }
}
