package com.test;

import com.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSystemTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "spring-application.xml");

    UserService userService = applicationContext.getBean("userService", UserService.class);

    System.out.println(userService.getUserList());

  }

}
