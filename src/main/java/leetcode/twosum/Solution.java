package leetcode.twosum;

/**
 *
 * 1. Two Sum <a href="https://leetcode.com/problems/two-sum/"/>
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Constraints:
 *
 * <ul>
 *  <li>2 <= nums.length <= 104</li>
 *  <li>-109 <= nums[i] <= 109</li>
 *  <li>-109 <= target <= 109</li>
 *  <li>Only one valid answer exists.</li>
 * </ul>
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length-1; i++){
            for(int x = i+1; x<nums.length; x++){
                if(nums[i]+nums[x]==target){
                    return new int[]{i,x};
                }
            }
        }
        return new int[]{};
    }
}