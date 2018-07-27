package com.var4.services;

import com.var4.models.User;
import com.var4.userDao.UserDaoI;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService4")
public class UserService {

  @Autowired //работает по имени
  @Qualifier("userDao1var4")
  UserDaoI userDao;


  @Resource(name = "userDao2var4")
 // @Qualifier("userDao2var4")
  UserDaoI userDao2;

  public List<User> getUserList() {
    return userDao.getUserList();
  }

  public List<User> getUserList2() {
    return userDao2.getUserList();
  }
}
