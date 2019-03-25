package com.foodapp.dao;

import com.foodapp.model.Login;
import com.foodapp.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}