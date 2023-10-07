package com;

import java.util.Arrays;

public class bubbleSort {

    //顺序排序
    public static void sort(int[] nums){
        int temp;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] =nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1,0,1,0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }


}
