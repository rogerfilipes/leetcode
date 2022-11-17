package leetcode.lc0299_bullsandcows;

/**
 * 299. Bulls and Cows <a href="https://leetcode.com/problems/bulls-and-cows/" />
 * <p>
 * You are playing the Bulls and Cows game with your friend.
 * <p>
 * You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:
 * <p>
 * The number of "bulls", which are digits in the guess that are in the correct position.
 * The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
 * Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.
 * <p>
 * The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.
 */
public class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0, cow = 0;

        int[] sarr = new int[10];
        int[] garr = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i)) {
                sarr[secret.charAt(i) - '0']++;
                garr[guess.charAt(i) - '0']++;
            } else {
                bull++;
            }
        }

        for (int i = 0; i <= 9; i++) {
            cow += Math.min(sarr[i], garr[i]);
        }

        return (bull + "A" + cow + "B");
    }
}
