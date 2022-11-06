package leetcode.lc0567_permutationstring;

import java.util.HashMap;
import java.util.Map;

/**
 * 567. Permutation in String <a href="https://leetcode.com/problems/permutation-in-string/"/>
 * <p>
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        Map<Character, Integer> map = new HashMap<>(), map2 = new HashMap<>();

        for (char c : s1.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for (char c : s2.toCharArray()) map2.put(c, map2.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (map2.getOrDefault(entry.getKey(), 0) < entry.getValue())
                return false;
        }

        int end = 0, start = 0, counter = map.size(), len = s1.length();
        while (end < s2.length()) {
            char ch = s2.charAt(end);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) counter--;
            }
            end++;
            while (counter == 0) {
                ch = s2.charAt(start);
                if (end - start == len) return true;
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) >= 1) counter++;
                }
                start++;
            }
        }
        return false;
    }
}