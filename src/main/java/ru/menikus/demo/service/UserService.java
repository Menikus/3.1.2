package ru.menikus.demo.service;

import ru.menikus.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);


    void saveUser(User user);

    void updateUser(User updateUser);


    void deleteUser(int id);




}
