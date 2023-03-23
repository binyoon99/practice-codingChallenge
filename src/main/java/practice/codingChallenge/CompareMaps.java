package practice.codingChallenge;

import java.util.Map;

/*
Clarification Questions
  Can I use Java API?
  Do I need to compare reference equal or value equal?
  Do I need to consider custom class?
 */
public class CompareMaps {

  //Using Java Collection .equals API, and read API implementation
  public <K, V> boolean compareMapsAPI(Map<K, V> m1, Map<K, V> m2) {

    return  m1.equals(m2);
  }

  // Implement equals in HashJMap
  public <K, V> boolean compareMapsHash(Map<K, V> m1, Map<K, V> m2) {
    return true;
  }
}
