package ru.menikus.demo.service;

import org.springframework.stereotype.Service;
import ru.menikus.demo.dao.UserDao;
import ru.menikus.demo.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User updatedUser) {
        userDao.updateUser(updatedUser);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
