package leetcode.lc0438_anagramsinstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 438. Find All Anagrams in a String <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string"/>
 * <p>
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        Map<Character, Long> pCharacterMap = p.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> windowCharacterMap = new HashMap<>();

        int leftPointer = 0, rightPointer = 0;

        List<Integer> indexesFound = new ArrayList<>();

        for (; leftPointer <= s.length() - p.length(); leftPointer++) {
            for (; rightPointer < leftPointer + p.length(); rightPointer++) {
                char c = s.charAt(rightPointer);
                windowCharacterMap.put(c, windowCharacterMap.getOrDefault(c, 0L) + 1);

                if (leftPointer + rightPointer > p.length() && leftPointer > 0) {
                    char removedFromWindow = s.charAt(leftPointer - 1);
                    windowCharacterMap.put(removedFromWindow, windowCharacterMap.getOrDefault(removedFromWindow, 0L) - 1);
                }

                if (rightPointer - leftPointer == p.length() - 1 && checkIfCountMatch(pCharacterMap, windowCharacterMap))
                    indexesFound.add(leftPointer);
            }
        }
        return indexesFound;
    }

    private boolean checkIfCountMatch(Map<Character, Long> pCharacterMap, Map<Character, Long> windowCharacterMap) {
        for (Map.Entry entry : pCharacterMap.entrySet()) {
            if (windowCharacterMap.getOrDefault(entry.getKey(), 0L).intValue() != ((Long) entry.getValue()).intValue())
                return false;
        }
        return true;
    }
}
