package com.leetcode.dp;

/**
 * T0 = 0, T1 = 1, T2 = 1,
 * 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 */
public class 泰波那契数列 {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1||n==0) return 1;
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n-1];
    }
}
