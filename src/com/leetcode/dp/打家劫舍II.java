package com.leetcode.dp;

import java.util.Arrays;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋，
 * 每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，
 * 这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 * 给定一个代表每个房屋存放金额的非负整数数组，
 * 计算你 在不触动警报装置的情况下 ，今晚能够偷窃到的最高金额
 */
public class 打家劫舍II {
    //偷了第一家就不能偷最后一家
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0],nums[1]);

        //分两种情况
        //1.偷了第一家
        //2.偷了最后一家
        int res1 = myRob0(Arrays.copyOfRange(nums,0,len-1));
        int res2 = myRob0(Arrays.copyOfRange(nums,1,len));

        return Math.max(res1,res2);

    }

    public int myRob0(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
    //优化 dp[i] 只与 dp[i-2] dp[i-1]相关 则可以用变量来表示，不占内存
    public int myRob1(int[] nums){
        int pre = nums[0];
        int cur = Math.max(nums[0],nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int index = cur;
            cur = Math.max(pre+nums[i],cur);
            pre = index;
        }
        return cur;
    }


    }
