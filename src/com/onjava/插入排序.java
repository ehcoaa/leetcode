package com.onjava;

public class 插入排序 {
    /**
     * 插入排序
     * @param nums
     */
    public void inset_sort(int[] nums){
        int len = nums.length;
        int j;
        for (int i = 1; i < len-1; i++) {//从第二个元素开始，我们默认第一个元素已经是有序的
            int temp = nums[i];//记下这个数
            for ( j = i-1; j>=0&&nums[j]>temp ;j-- ) {
                //目前这个数 比它上一个、上一个、上一个还小
                //我们需要移动数组，给没目前这个数腾出位置
                nums[j+1] =nums[j];
            }
            nums[j] = temp; //找到它的位置了，并且它之前元素我们已经先前移动了，直接赋值
        }
    }
}
