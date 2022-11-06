package leetcode.lc0167_twosumii;

/**
 * 167. Two Sum II - Input Array Is Sorted  <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/"/>
 * <p>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * <p>
 * Your solution must use only constant extra space.
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            if ((numbers[l] + numbers[r]) > target) {
                r--;
            } else if ((numbers[l] + numbers[r]) < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }

        return new int[]{};
    }
}