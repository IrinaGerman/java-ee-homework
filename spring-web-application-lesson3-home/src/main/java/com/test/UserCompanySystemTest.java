package com.test;

import com.services.CompanyService;
import com.services.UserCompanyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserCompanySystemTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "spring-application.xml");

    UserCompanyService userCompanyService = applicationContext
        .getBean("userCompanyService", UserCompanyService.class);

    System.out.println(userCompanyService.getUserCompanyList());
  }

}
