package com.var1.services;

import com.var1.models.User;
import com.var1.userDao.UserDaoI;
import com.var1.userDao.UserDao1;
import com.var1.userDao.UserDao2;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService1")
public class UserService {

  @Autowired //по типу работает, только если поля являются полями разных классов

  UserDao1 userDao1;


  @Autowired

  UserDao2 userDao2;


  public List<User> getUserList() {
    return userDao1.getUserList();
  }

  public List<User> getUserList2() {
    return userDao2.getUserList();
  }
}
