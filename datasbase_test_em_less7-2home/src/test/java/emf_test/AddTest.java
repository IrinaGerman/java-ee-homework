package emf_test;

import com.jpa_hibernate_test.CompaniesEntity;
import com.jpa_hibernate_test.UsersEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/spring-application.xml")
public class AddTest {

  @PersistenceContext
  private EntityManager entityManager;

  @Test
  @Transactional
  @Rollback(false)
  public void addTest() {
    UsersEntity usersEntity = new UsersEntity();
    usersEntity.setName("name3");
    usersEntity.setAge(13);
    CompaniesEntity companiesEntity = entityManager.find(CompaniesEntity.class, 1);
    usersEntity.setCompaniesEntity(companiesEntity);

    entityManager.persist(usersEntity);
    entityManager.flush();

    Query query = entityManager.createQuery("from UsersEntity ");
    List resultList = query.getResultList();
    Assert.assertEquals(3, resultList.size());
  }
}
