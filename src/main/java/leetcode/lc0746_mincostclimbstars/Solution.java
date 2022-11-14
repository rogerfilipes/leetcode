package leetcode.lc0746_mincostclimbstars;

import java.util.Arrays;

/**
 * 746. Min Cost Climbing Stairs <a href="https://leetcode.com/problems/min-cost-climbing-stairs"/>
 * <p>
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
 * <p>
 * You can either start from the step with index 0, or the step with index 1.
 * <p>
 * Return the minimum cost to reach the top of the floor.
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int[] costAggregate = Arrays.copyOf(cost, cost.length + 1);

        for (int i = costAggregate.length - 3; i >= 0; i--) {
            costAggregate[i] += Math.min(costAggregate[i + 1], costAggregate[i + 2]);
        }


        return Math.min(costAggregate[0], costAggregate[1]);
    }

}
