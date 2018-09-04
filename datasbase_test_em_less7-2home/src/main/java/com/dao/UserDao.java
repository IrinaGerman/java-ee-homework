package com.dao;

import com.models.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {


  List<User> userList = Arrays.asList(new User("name1", 11), new User("name2", 12));

  public List<User> getUserList() {
    return userList;
  }
}
