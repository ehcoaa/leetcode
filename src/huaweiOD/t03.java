package huaweiOD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class t03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] str = in.split(" ");
        int[] nums = new int[str.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        System.out.println(choose(nums));
    }
    public static int choose(int[] nums){
        if(nums==null||nums.length==0)return 0;
        int len = nums.length;
        if(len==1) return nums[0];

        //建立动态数组
        int[] dp = new int[len];
        dp[0] =nums[0];
        dp[1] =Math.max(nums[0],nums[1]);

        for(int i=2;i<len;i++){
            //对于i这个位置，有两种选择，要么跳，要么不跳
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[len-1];
    }
}
