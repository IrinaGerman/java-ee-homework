package com.var3.services;

import com.var3.userDao.UserDaoI;
import com.var3.models.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService3")
public class UserService {

  @Autowired //работает по имени
  @Qualifier("userDao1var3")
  UserDaoI userDao;


  @Autowired
  @Qualifier("userDao2var3")
  UserDaoI userDao2;

  public List<User> getUserList() {
    return userDao.getUserList();
  }

  public List<User> getUserList2() {
    return userDao2.getUserList();
  }
}
