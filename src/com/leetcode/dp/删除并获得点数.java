package com.leetcode.dp;

/**
 * 给你一个整数数组 nums ，你可以对它进行一些操作。
 * 每次操作中，选择任意一个 nums[i] ，
 * 删除它并获得 nums[i] 的点数。之后，
 * 你必须删除 所有 等于 nums[i] - 1 和 nums[i] + 1 的元素。
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 输入：nums = [3,4,2]
 * 输出：6
 * 解释：
 * 删除 4 获得 4 个点数，因此 3 也被删除。
 * 之后，删除 2 获得 2 个点数。总共获得 6 个点数。
 */
public class 删除并获得点数 {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==1) return nums[0];

        Arrays.sort(nums);//排序
        HashMap<Integer,Integer> map = new HashMap<>();

        //记录出现次数
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        //数组去重
        int i =0;
        int j =1;
        while (j<nums.length){
            //不同
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
            }
            //相同则跳过就行
            j++;
        }

        //新数组，排序后的，每个数字只出现一次的数组
        int[] ints = Arrays.copyOfRange(nums, 0, j);

        int[] dp = new int[ints.length];
        return 1;

    }

    //转换称为打家劫舍的问题
    public int deleteAndEarn0(int[] nums) {
        /**
         * 以nums[i]作为数组trans[]下标，值存的是nums[i]在nums[]中出现的总和，
         * 表示小偷如果偷了nums[i]，那么它可以把nums[]中所有等于numsp[i]的房屋全偷光
         * nums[i]是trans[]的下标，那么nums[i-1]、nums[i+1]也会在trans[]中相邻
         * 所以小偷不能偷相邻的房屋
         */
        int[] trans = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            trans[nums[i]] +=nums[i];
        }

        int[] dp = new int[10001];
        dp[1] = trans[1];

        for (int i = 2; i < trans.length; i++) {
            dp[i] = Math.max(dp[i-2]+trans[i],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
