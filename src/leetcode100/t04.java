package leetcode100;

import java.util.Arrays;

public class t04 {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                int j = i;
                // 一次只管一个位置就行
                while(j<nums.length){
                    if(nums[j]!=0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                    j++;
                }
            }else
                continue;
        }
        System.out.println(Arrays.toString(nums));
    }
    //逆向思维
    public static void moveZeroes0(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[index++] = nums[i];
                nums[i]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {

        moveZeroes0(new int[]{0,1,0,3,12});
    }
}
