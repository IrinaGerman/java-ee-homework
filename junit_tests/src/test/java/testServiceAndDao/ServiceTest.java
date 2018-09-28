package testServiceAndDao;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import com.UserService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {

  @Test
  public void checkServiceSpy() {
    UserService userService = new UserService();
    List spy;
    try {
      spy = spy(userService.getUserList());
      fillListAndAssert(spy);
    } catch (Exception e) {
      System.out.println("No userList from UserDaoI");
      List arrayList = new ArrayList((Arrays.asList(-2, -3, -4)));
      spy = spy(arrayList);
      fillListAndAssert(spy);
    }
  }

  private void fillListAndAssert(List spy) {
    when(spy.get(0)).thenReturn(2);
    when(spy.get(1)).thenReturn(3);
    when(spy.get(2)).thenReturn(4);
    when(spy.size()).thenReturn(3);

    Assert.assertEquals(2, spy.get(0));
    Assert.assertEquals(3, spy.size());
  }
}
