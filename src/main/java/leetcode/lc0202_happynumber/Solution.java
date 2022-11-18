package leetcode.lc0202_happynumber;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number <a href="https://leetcode.com/problems/happy-number" />
 * <p>
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */
public class Solution {

    Set<Integer> processed = new HashSet<>();

    public boolean isHappy(int n) {

        int temp = n;
        int sum = 0;

        do {
            int digit = temp % 10;
            temp /= 10;
            sum += digit * digit;
        } while (temp > 0);

        if (sum == 1)
            return true;

        if (processed.contains(sum))
            return false;

        processed.add(sum);

        return isHappy(sum);
    }
}
