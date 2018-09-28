package test_math;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {

  @Test
  public void testFact1() {
    int fact = 3;
    int actualResult = Factorial.fact(fact);
    assert actualResult ==6 : "not valid value for 3!";
  }

  @Test
  public void testFact2() {
    int fact = 4;
    int actualResult = Factorial.fact(fact);
    assertEquals(24, actualResult);
    //assert actualResult == 24 : "not valid value for 3!";
  }

  @Test
  public void testFact3() {
    int fact = 5;
    int actualResult = Factorial.fact(fact);
    assert actualResult == 120 : "not valid value for 3!";
  }
}
