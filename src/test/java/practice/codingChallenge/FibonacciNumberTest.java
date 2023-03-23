package practice.codingChallenge;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciNumberTest {

  FibonacciNumber fib ;

  @Before
  public void setUp() throws Exception {
    fib = new FibonacciNumber();
  }

  @Test
  public void fibRecursion() {
    assertEquals( 3, fib.fibRecursion(4));
  }

  @Test
  public void fibDynamic() {
    assertEquals( 3, fib.fibDynamic(4));
  }
}