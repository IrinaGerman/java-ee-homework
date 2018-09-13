package com;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CompanyController {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "spring-application.xml");
    CompanyService service = applicationContext.getBean("companyService", CompanyService.class);
    List allCompanies = service.getAllCompanies();
    System.out.println(allCompanies);
  }
}
