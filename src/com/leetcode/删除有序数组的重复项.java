package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。
 * 不需要考虑数组中超出新长度后面的元素。
 */
public class 删除有序数组的重复项 {
    //双指针法
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=1) return 1;

        int res =1;
        int l = 0;
        int r =l+1;

        HashSet<Integer> set = new HashSet<>();
        set.add(nums[l]);
        while (r<nums.length){
            //已经包含了，直接跳过
            if(set.contains(nums[r])){
                r++;
            }else {//未包含
                set.add(nums[r]);
                nums[l+1] = nums[r];
                l++;
                res++;//长度
                r++;
            }
        }
        nums = Arrays.copyOfRange(nums,0,res+1);
        return res;
    }

    //双指针＋有序
    public static int removeDuplicates0(int[] nums) {
        if(nums.length==1) return 1;
        int l=0;
        int r=l+1;

        while (r<nums.length){
            if(nums[l]!=nums[r]){
                nums[l+1] = nums[r];
                l++;
            }
            r++;
        }
        return l+1;//长度

    }


        public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2});
    }
}
