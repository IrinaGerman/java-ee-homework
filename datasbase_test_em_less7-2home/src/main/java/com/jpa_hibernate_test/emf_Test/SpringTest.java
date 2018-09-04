package com.jpa_hibernate_test.emf_Test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "spring-application.xml");
    EntityManagerFactory factory = context
        .getBean("entityManagerFactory", EntityManagerFactory.class);
    EntityManager entityManager = factory.createEntityManager();

    List resultList = entityManager.createQuery("from UsersEntity ").getResultList();

    System.out.println(resultList);
    factory.close();
  }

}
