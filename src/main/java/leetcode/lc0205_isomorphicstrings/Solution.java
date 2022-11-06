package leetcode.lc0205_isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings <a href="https://leetcode.com/problems/isomorphic-strings"/>
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
public class Solution {
    public boolean isIsomorphic(String left, String right) {
        Map<Character, Character> mapLeftToRight = new HashMap<>();
        Map<Character, Character> mapRightToLeft = new HashMap<>();

        for (int i = 0; i < left.length(); i++) {
            char leftChar = left.charAt(i);
            char rightChar = right.charAt(i);

            Character leftMapping = mapLeftToRight.get(leftChar);
            Character rightMapping = mapRightToLeft.get(rightChar);

            if ((leftMapping != null && leftMapping != Character.valueOf(rightChar)) || (rightMapping != null && rightMapping != Character.valueOf(leftChar))) {
                return false;
            } else {
                mapLeftToRight.put(leftChar, rightChar);
                mapRightToLeft.put(rightChar, leftChar);
            }
        }
        return true;
    }
}
