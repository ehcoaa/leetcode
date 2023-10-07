package com.leetcode.dp;

/**
 * 给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false
 */

/**
 * [3,2,1,0,4]
 * [3,3,3,3,
 */
public class 跳跃游戏 {
    public boolean canJump(int[] nums) {
        int k = 0;//表示当前能到达的最远距离
        for (int i = 0; i < nums.length; i++) {
            if(k>=i){//表示能到达这个位置
                if(k>=nums.length-1)
                    return true;
                k = Math.max(k,nums[i]+i);//更新一下能达到的最远的位置
            }
        }
        return false;
    }
}
