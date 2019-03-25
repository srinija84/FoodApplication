package com.foodapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodapp.dao.UserDao;
import com.foodapp.model.Login;
import com.foodapp.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}