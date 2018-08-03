package com.services;

import com.dao.UserDao;
import java.util.List;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserDao userDao;

  public List<User> getUserList() {
  return  userDao.getUserList();

  }
}
