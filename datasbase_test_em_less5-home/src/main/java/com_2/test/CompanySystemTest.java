package com_2.test;

import com_2.services.CompanyService;
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
