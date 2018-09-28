package test_math;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FactorialWithParametrsTest {

  @Parameters
  public static Collection init(){
    return Arrays.asList(new Object[][]{
      {3,6},
      {4,24}
    }
    );
  }
  @Parameter(0)
  public int numberForFactorialRecalculation;

  @Parameter(1)
  public int expectedResult;

  @Test
  public void factTest(){
    int actualResult = Factorial.fact(numberForFactorialRecalculation);
    assertEquals(expectedResult, actualResult );
  }
}
