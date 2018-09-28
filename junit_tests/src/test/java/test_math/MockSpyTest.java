package test_math;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MockSpyTest {

  public void checkMockList() {

    List mock = mock(List.class);
    when(mock.get(10)).thenReturn(12);
    when(mock.size()).thenReturn(-1);
    Assert.assertEquals(12, mock.get(10));
    Assert.assertEquals(-1, mock.size());
    Assert.assertNull(mock.get(200));
  }

  @Test
  public void checkSpyList() {

    ArrayList arrayList = new ArrayList(Arrays.asList(1, 3, 5, 7));

    ArrayList spy = spy(arrayList);
    when(spy.get(0)).thenReturn(34);
    spy.get(0);
    verify(spy, times(1)).get(anyInt());
    //Assert.assertNull(spy.get(200));

  }
}
