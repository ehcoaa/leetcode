package com.leetcode;

public class 寻找数组中心下标 {
    public int pivotIndex(int[] nums) {
        int sum =0;
        for (int num : nums) {
            sum+=num;
        }

        int presum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sum-nums[i]-presum == presum)
                return i;
            presum+=nums[i];
        }
        return -1;

    }
}
