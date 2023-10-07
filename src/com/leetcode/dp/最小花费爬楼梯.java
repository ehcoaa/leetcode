package com.leetcode.dp;

/**
 * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。
 * 一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 * 请你计算并返回达到楼梯顶部的最低花费。
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 */
public class 最小花费爬楼梯 {
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int dp[] = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];
        }

        return Math.min(dp[len-2],dp[len-1]);
    }

    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
