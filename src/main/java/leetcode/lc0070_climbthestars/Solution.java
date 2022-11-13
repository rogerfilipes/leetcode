package leetcode.lc0070_climbthestars;

/**
 * 70. Climbing Stairs <a href="https://leetcode.com/problems/climbing-stairs"/>
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class Solution {
    public int climbStairs(int n) {
        int cache[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++)
            cache[i] = -1;
        return memoization(n, cache);

    }

    public int memoization(int n, int dp[]) {
        if (n == 1) return 1;
        if (n == 0) return 1;
        if (dp[n] != -1) return dp[n];

        dp[n] = memoization(n - 1, dp) + memoization(n - 2, dp);
        return dp[n];
    }

}
