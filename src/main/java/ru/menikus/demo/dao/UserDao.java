package ru.menikus.demo.dao;

import ru.menikus.demo.model.User;

import java.util.List;

public interface UserDao {


    List<User> getAllUsers();

    User getUserById(int id);


    void saveUser(User user);

    void updateUser(User updatedUser);


    void deleteUser(int id);


}
