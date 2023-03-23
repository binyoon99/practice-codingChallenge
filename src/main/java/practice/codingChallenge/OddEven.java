package practice.codingChallenge;

public class OddEven {

  /**
   * Big-O: O(1)
   * Justification: it's an arithmetic operation
   */
  public String oddEvenMod(int i){
    return i % 2 == 0 ? "even" : "odd";
  }

  /**
   * Big-O:
   * Justification:
   * Let's take integer 25, which is odd.
   * In binary 25 is 00011001. Notice that the least significant bit b0 is 1.
   */
  public String oddEvenBit(int i){
     return (i & 1) == 1? "odd" : "even";

    }
  }