package practice.codingChallenge;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class CompareMapsTest {

  CompareMaps compareMaps;

  @Before
  public void setUp() throws Exception {
    compareMaps = new CompareMaps();
  }

  @Test
  public void compareMapsAPI() {
    Map<String, Integer> map1 = new HashMap<>();
    map1.put("A", 1);
    map1.put("B", 2);
    map1.put("C", 3);

    Map<String, Integer> map2 = new HashMap<>();
    map2.put("C", 3);
    map2.put("A", 1);
    map2.put("B", 2);

    assertEquals( map1, map2);
  }

  @Test
  public void compareMapsHash() {
    Map<String, Integer> map1 = new HashMap<>();
    map1.put("A", 1);
    map1.put("B", 2);
    map1.put("C", 3);

    Map<String, Integer> map2 = new HashMap<>();
    map2.put("C", 3);
    map2.put("A", 1);
    map2.put("B", 2);

    assertEquals( map1, map2);
  }
}