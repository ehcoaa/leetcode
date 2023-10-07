package com.leetcode;

public class 最大子数组和 {

    //加还是不加这个数
    public int maxSubArray(int[] nums) {
        //只有一个
        int len = nums.length;
        if (len == 1) return nums[0];

        int dp[] = new int[len];
        dp[0] = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 1] + nums[i]);//那个大选那个
            res = Math.max(dp[i], res);
        }
        return res;
    }

    public int maxSubArray1(int[] nums) {
        int res = nums[0]; //如果只有一个元素也返回
        int sum = 0; //子数组和

        for (int i = 0; i < nums.length; i++) {
            if(sum>0){       //现在和还是正数，可以加上负数 也可以加上正数，这里不用担心会丢失最优解
                sum+=nums[i];
            }else {         //加到一定多的负数之后，sum小于0了，那还不如之前大，重新开始
                sum = nums[i];
            }
            res = Math.max(res,sum);//每一次循环都会将当前的最优解记录下来。
        }
        return res;
    }
}
