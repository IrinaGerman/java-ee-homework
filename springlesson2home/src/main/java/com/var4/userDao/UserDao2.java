package com.var4.userDao;

import com.var4.models.User;
import com.var4.userDao.UserDaoI;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("userDao2var4")
public class UserDao2 implements UserDaoI {

  List<User> userList2 = Arrays.asList(
      new User("name21", 21),
      new User("name22", 21));

  public List<User> getUserList() {
    return userList2;

  }
}
