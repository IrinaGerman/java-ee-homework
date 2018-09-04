package com_2.dao;

import com_2.models.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

  List<User> userList = Arrays.asList(new User("name21", 11), new User("name22", 12));

  public List<User> getUserList() {
    return userList;
  }
}
