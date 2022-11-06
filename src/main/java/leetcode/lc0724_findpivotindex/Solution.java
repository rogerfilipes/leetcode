package leetcode.lc0724_findpivotindex;

/**
 * 724. Find Pivot Index <a href="https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1"/>
 * <p>
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int sumLeft = 0;

        for (int x : nums)
            sum += x;

        for (int i = 0; i < nums.length; ++i) {
            if (sumLeft == sum - sumLeft - nums[i])
                return i;

            sumLeft += nums[i];
        }
        return -1;
    }
}
