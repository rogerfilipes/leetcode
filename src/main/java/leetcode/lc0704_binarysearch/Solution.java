package leetcode.lc0704_binarysearch;

/**
 * 704. Binary Search <a href="https://leetcode.com/problems/binary-search/"/>
 * <p>
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class Solution {
    public int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex <= rightIndex) {
            int searchPointer = (leftIndex + rightIndex) / 2;

            if (nums[searchPointer] == target) {
                return searchPointer;
            }

            if (nums[searchPointer] < target) {
                leftIndex = searchPointer + 1;
            }

            if (nums[searchPointer] > target) {
                rightIndex = searchPointer - 1;
            }
        }

        return -1;
    }
}
