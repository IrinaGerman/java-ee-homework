package com;

import java.util.List;

public class UserService {

  UserDaoI userDaoI;

  public List getUserList() {
    List userList = userDaoI.getUserList();
    return userList;
  }
}
