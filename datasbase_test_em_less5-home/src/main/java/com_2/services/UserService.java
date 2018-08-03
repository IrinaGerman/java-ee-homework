package com_2.services;

import com_2.dao.UserDao;
import com_2.models.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserDao userDao;

  public List<User> getUserList() {
    return userDao.getUserList();

  }
}
