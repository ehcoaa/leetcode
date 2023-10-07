package leetcode100.二分查找;

import java.util.Arrays;

public class 查找数组中第一个和最后一个位置 {

    public static int[] searchRange(int[] nums, int target) {
           int l = 0;
           int r = nums.length-1;
           //查找第一个位置
           while(l<=r){
               int mid = (l+r)/2;
               //往左边查找
               if(nums[mid]>=target){
                   r=mid-1;
               }
               else{
                   l=mid+1;
               }
           }
           int first = nums[l]==target?l:-1;

           l = 0;
           r = nums.length-1;
           while (l<=r){
               int mid = (l+r)/2;
               if(nums[mid]<=target){
                   l = mid+1;
               }else {
                   r =mid-1;
               }
           }
           int last = nums[r]==target?r:-1;

           return new int[]{first,last};
    }

    public static void main(String[] args) {
        int[] ints= new int[]{5,7,7,8,8,8,8,10};
        System.out.println(Arrays.toString(searchRange(ints, 8)));
    }
}
