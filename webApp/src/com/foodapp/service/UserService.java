
package com.foodapp.service;

import com.foodapp.model.Login;
import com.foodapp.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}