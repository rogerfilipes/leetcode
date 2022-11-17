package leetcode.lc0424_longestrepeatingcharreplace;

/**
 * 424. Longest Repeating Character Replacement <a href="https://leetcode.com/problems/longest-repeating-character-replacement/" />
 * <p>
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 * <p>
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 */
public class Solution {
    public int characterReplacement(String sample, int k) {
        int leftPointer = 0;

        int windowCharCount[] = new int['Z' - 'A' + 1]; //26

        int maxSequence = 0;

        for (int rightPointer = 0; rightPointer < sample.length(); rightPointer++) {

            windowCharCount[sample.charAt(rightPointer) - 'A']++;

            int currentSequenceLength = rightPointer - leftPointer + 1;
            int currentMaxFreq = maxFrequency(windowCharCount);
            if (currentSequenceLength - currentMaxFreq <= k) {
                maxSequence = Math.max(maxSequence, currentSequenceLength);
            } else {
                windowCharCount[sample.charAt(leftPointer) - 'A']--;
                leftPointer++;
            }
        }
        return maxSequence;
    }

    private int maxFrequency(int[] map) {
        int maxFrequency = 0;
        for (int i = 0; i < map.length; i++) {
            maxFrequency = Math.max(maxFrequency, map[i]);
        }
        return maxFrequency;
    }
}
