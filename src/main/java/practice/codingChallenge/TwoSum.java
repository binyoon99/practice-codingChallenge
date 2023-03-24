package practice.codingChallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

  /**
   * Time Complexity : O(n^2) - two nested loop
   *
   * @param array  array of integers size: 2~10^4
   * @param target number that adds up
   * @return array of two indicies
   */
  public int[] twoSumBruteForce(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }

  /**
   * Time complexity: O(n). - First loop adding key,value to the map and second loop finding the
   * desired number.
   *
   * @param array
   * @param target
   * @return
   */
  public int[] twoSumMap(int[] nums2, int target) {
    int[] resultArr = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    // map(value, index)
    for (int i = 0; i < nums2.length; i++) {
      map.put(nums2[i], i);
    }
    for (int i = 0; i < nums2.length; i++) {
      int desireNum = target - nums2[i];
      // if map contains desireNum than the value(index) is what we want
      // however, we need to confirm that desireNum is not same index as i itself
      if (map.containsKey(desireNum) && map.get(desireNum) != i) {
        resultArr[0] = i;
        resultArr[1] = map.get(desireNum);
        return resultArr;
      }
    }
    return resultArr;
  }

}
