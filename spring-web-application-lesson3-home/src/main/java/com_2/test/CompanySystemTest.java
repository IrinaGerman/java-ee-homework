package com.test;

import com.services.CompanyService;
import com.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanySystemTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "spring-application.xml");

    CompanyService companyService = applicationContext
        .getBean("companyService", CompanyService.class);

    System.out.println(companyService.getCompanyList());

  }

}
