package com.var1.userDao;

import com.var1.models.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("userDao1var1")
public class UserDao1 implements UserDaoI{

  List<User> userList1 = Arrays.asList(
      new User("name1", 11),
      new User("name2", 11));

  public List<User> getUserList() {
    return userList1;
  }
}
