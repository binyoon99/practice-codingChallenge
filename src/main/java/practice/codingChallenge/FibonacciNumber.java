package practice.codingChallenge;

/*
  https://leetcode.com/problems/fibonacci-number/
  1. Recursion
  2. Dynamic Programming
 */
public class FibonacciNumber {

  public int fibRecursion(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    ;
    return fibRecursion(n - 1) + fibRecursion(n - 2);
  }

  /*
   * breaking down a complex problem into smaller subproblems,
   * solving each subproblem only once,
   * and storing the solution to each subproblem to avoid redundant computations.
   *
   * Memoization, storing the result of each subproblem in a lookup array
   *     by doing this we can avoid redundant calculations.
   * */

  public int fib (int i, int[] memo) {
    if(i == 0 || i == 1) return i;

    if(memo[i] == 0){
      memo[i] = fib(i - 1, memo) + fib(i - 2, memo);
    }
    return memo[i];
  }
  public int fibDynamic(int n) {
    return fib(n , new int[n+1]);
  }

}
