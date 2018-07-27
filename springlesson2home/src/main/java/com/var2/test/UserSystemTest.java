package com.var2.test;

import com.var2.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSystemTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
        "spring-application.xml");

    UserService userService = classPathXmlApplicationContext
        .getBean("userService2", UserService.class);

    System.out.println(userService.getUserList());
    System.out.println(userService.getUserList2());
  }

}
