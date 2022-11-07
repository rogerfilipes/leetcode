package leetcode.lc0409_longestpalindrome;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 409. Longest Palindrome <a href="https://leetcode.com/problems/longest-palindrome"/>
 * <p>
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
 * <p>
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class Solution {
    public int longestPalindrome(String letters) {

        Map<Character, Long> characterCount = letters.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int total = 0;
        int odd = 0;

        for (Long c : characterCount.values()) {
            if (c % 2 == 0) {
                total += c;
            } else {
                total += c - 1;
                odd = 1;
            }
        }

        return total + odd;
    }
}
