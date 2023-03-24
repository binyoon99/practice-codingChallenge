package practice.codingChallenge;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

  TwoSum twosum;

  @Before
  public void setUp() throws Exception {
    twosum = new TwoSum();
  }

  @Test
  public void twoSumBruteForce() {
    int [] arr = new int [] {2,7,11,15};
    int target = 9;

    int [] arr1 = new int [] {3,2,4};
    int target1 = 6;

    int [] arr2 = new int [] {3,3};
    int target2 = 6;

    assertArrayEquals(new int [] {0,1}, twosum.twoSumBruteForce(arr,target));
    assertArrayEquals(new int [] {1,2}, twosum.twoSumBruteForce(arr1,target1));
    assertArrayEquals(new int [] {0,1}, twosum.twoSumBruteForce(arr2,target2));
  }

  @Test
  public void twoSumMap() {
    int [] arr = new int [] {2,7,11,15};
    int target = 9;

    int [] arr1 = new int [] {3,2,4};
    int target1 = 6;

    int [] arr2 = new int [] {3,3};
    int target2 = 6;

    assertArrayEquals(new int [] {0,1}, twosum.twoSumMap(arr,target));
    assertArrayEquals(new int [] {1,2}, twosum.twoSumMap(arr1,target1));
    assertArrayEquals(new int [] {0,1}, twosum.twoSumMap(arr2,target2));
  }
}