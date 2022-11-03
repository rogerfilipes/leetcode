package leetcode.besttimebuysellstock;

/**
 * 121. Best Time to Buy and Sell Stock <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/"/>
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyValue = Integer.MAX_VALUE;

        for (int i = 0; i<prices.length; i++) {
            if (prices[i] < buyValue) {
                buyValue = prices[i] ;
            } else {
                profit = Math.max(profit, prices[i] - buyValue);
            }
        }
        return profit;
    }
}