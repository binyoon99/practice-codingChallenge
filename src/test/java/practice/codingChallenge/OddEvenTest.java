package practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OddEvenTest {
  public OddEven oddEven;

  @Before
  public void setUp() throws Exception {
    oddEven = new OddEven();
  }

  @Test
  public void oddEvenMod() {
    int test1 = 2;
    String result1 = "even";

    int test2 = 5;
    String result2 = "odd";

    //Assert.assertEquals(result1, oddEven.oddEvenMod(test1));
    assertEquals(result1, oddEven.oddEvenMod(test1));
    assertEquals(result2, oddEven.oddEvenMod(test2));


  }

  @Test
  public void oddEvenBit() {
    int test1 = 2;
    String result1 = "even";

    int test2 = 5;
    String result2 = "odd";

    assertEquals(result1, oddEven.oddEvenMod(test1));
    assertEquals(result2, oddEven.oddEvenMod(test2));

  }
}