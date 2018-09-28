package testServiceAndDao;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.UserDaoI;
import org.junit.Assert;
import org.junit.Test;

public class DaoTest {

  @Test
  public void checkDaoMock() {

    UserDaoI daoI = mock(UserDaoI.class);

    when(daoI.get(0)).thenReturn(2);
    when(daoI.get(1)).thenReturn(3);
    when(daoI.get(3)).thenReturn(5);

    Assert.assertEquals(2, daoI.get(0));
    Assert.assertEquals(5, daoI.get(3));
    Assert.assertNull(daoI.get(2));
  }
}
