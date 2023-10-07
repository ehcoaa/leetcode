package com.leetcode.dp;

import java.util.Arrays;

public class 最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int[] dp =new int[nums.length];
        Arrays.fill(dp,1);

        for (int i = 1; i <nums.length; i++) {
            for (int j = 0; j < i; j++) { //在[0,i)之间 ,可能有多个nums[i] 满足if(),找那个最大的
                if(nums[i]>nums[j]){//说明子序列可以加长
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res,dp[i]);
        }

        return  res;
    }
}
