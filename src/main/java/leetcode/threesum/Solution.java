package leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 3Sum <a href="https://leetcode.com/problems/3sum/" />
 *
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> foundResults = new ArrayList<>();

        for(int i = 0; i<nums.length-2; i++){

            if(i == 0 || (i>0 && nums[i]!=nums[i-1])) {
                //two sum here, find combination that leads to 0

                int l = i + 1;
                int r = nums.length - 1;
                int target = 0 - nums[i];

                while (l < r) {
                    if (nums[l] + nums[r] == target) {
                        foundResults.add(Arrays.asList(nums[i], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }

                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }

                        l++;
                        r--;
                    } else if (nums[i] + nums[l] + nums[r] > 0) {
                        r--;
                    } else {
                        l++;
                    }

                }
            }
        }

        return foundResults;
    }
}
