package leetcode.lc1480_runningsum1d;

/**
 * 1480. Running Sum of 1d Array <a href="https://leetcode.com/problems/running-sum-of-1d-array/"/>
 * <p>
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 */
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
