package leetcode.lc0238_productarrayexceptself;

/**
 * 238. Product of Array Except Self <a href="https://leetcode.com/problems/product-of-array-except-self/"/>
 * <p>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Perform Prefix product operation by traversing Left -> Right
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        // Perform Postfix product operation by traversing Right -> Left
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }
}
