package com.var2.services;

import com.var2.userDao.UserDaoI;
import com.var2.models.User;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService2")
public class UserService {

  @Resource(name = "userDao1var2") //работает по имени
  UserDaoI userDao1;


  @Resource(name = "userDao2var2")
  UserDaoI userDao2;

  public List<User> getUserList() {
    return userDao1.getUserList();
  }

  public List<User> getUserList2() {
    return userDao2.getUserList();
  }
}
