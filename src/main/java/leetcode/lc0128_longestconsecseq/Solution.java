package leetcode.lc0128_longestconsecseq;

import java.util.HashMap;
import java.util.Map;

/**
 * 128. Longest Consecutive Sequence <a href="https://leetcode.com/problems/longest-consecutive-sequence/ />
 * <p>
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * <p>
 * You must write an algorithm that runs in O(n) time.
 */

class Solution {
    public int longestConsecutive(int[] nums) {

        Map<Integer, Boolean> visited = new HashMap<>(nums.length);

        for (int n : nums) {
            visited.put(n, false);
        }

        Integer maxSequenceFound = 0;

        for (int number : nums) {
            Boolean hasBeenVisited = visited.get(number);
            if (hasBeenVisited != null && hasBeenVisited)
                continue;

            visited.put(number, true);


            int currentSequence = 1;
            int left = number - 1;
            int next = number + 1;

            while (visited.containsKey(left)) {
                visited.put(left, true);
                left--;
                currentSequence++;
            }

            while (visited.containsKey(next)) {
                visited.put(next, true);
                next++;
                currentSequence++;
            }

            if (currentSequence > maxSequenceFound)
                maxSequenceFound = currentSequence;


        }
        return maxSequenceFound;
    }
}