package com.var3.userDao;

import com.var3.models.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("userDao2var3")
public class UserDao2 implements UserDaoI {

  List<User> userList2 = Arrays.asList(
      new User("name21", 21),
      new User("name22", 21));

  public List<User> getUserList() {
    return userList2;

  }
}
