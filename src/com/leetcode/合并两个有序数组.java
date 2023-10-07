package com.leetcode;

import java.util.Arrays;

/**
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 */
public class 合并两个有序数组 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i=0;i<n;i++){
                nums1[m+i] =  nums2[i];
            }
            Arrays.sort(nums1);
    }
    //双指针方法
    public  static void merge0(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1;//合并后nums1组后一个元素下标
        m--;//nums1 最后一个元素下标
        n--;//nums2 最后一个元素下标


        while(n>=0){
            //第一个数组的数大
            if(m>=0&&nums1[m]>=nums2[n]){
                nums1[i] = nums1[m];//直接赋值
                m--;
            }
            else {
                nums1[i] = nums2[n];
                n--;
            }
            i--;
        }
    }




        public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge0(nums1,3,nums2,3 );
            System.out.println(Arrays.toString(nums1));
        }
}
