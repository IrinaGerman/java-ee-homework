package test_math;

public class Factorial {

  public static int fact(int f) {
    int result = 1;
    for (int i = 2; i <= f; i++) {
      result *= i; // 2! -> 1*2; 3! -> 1*2*3;
    }
    return result;
  }
}
