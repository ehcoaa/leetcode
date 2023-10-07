package leetcode100;

import java.util.Arrays;

public class t10 {
    public static int subarraySum(int[] nums, int k) {
        int res = nums[nums.length-1] == k ? 1:0;
        for (int i = 0; i < nums.length-1; i++) {
            int sum = nums[i];
            if(nums[i]==k)
                res++;
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum==k)
                    res++;
            }
        }
        return  res;
    }

    public static int subarraySum1(int[] nums, int k) {
        int res =0;
        int[] persum = new int[nums.length+1];

        // 数组前缀和表示，presum[4] = nums[0]+nums[1]+nums[2]+nums[3]
        for (int i = 0; i < nums.length; i++) {
            persum[i+1] = persum[i] + nums[i];//注意这个数组前缀和是从 1 开始的,因为nums[0]是没有前缀的，为0
        }
//:nums = [1,1,1], k = 2 输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length+1; j++) {
                if(persum[j]- persum[i] ==k)
                    res++;
            }
        }
        return res;
    }



        public static void main(String[] args) {
        subarraySum(new int[]{1,2,3},3);

        int[] nums = {1,1,1};
        int[] presum = new int[nums.length+1];

            for (int i = 0; i < nums.length; i++) {
                presum[i+1] =nums[i]+presum[i];
            }

            System.out.println(Arrays.toString(presum));
    }
}
