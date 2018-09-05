package emf_test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/spring-application.xml")
public class IntegrationTest {

  @PersistenceContext
  private EntityManager entityManager;

  @Test
  @Transactional
  public void integrationTest() {

    Query query = entityManager.createQuery("from UsersEntity ");
    List resultList = query.getResultList();
    Assert.assertEquals(2, resultList.size());
  }
}
