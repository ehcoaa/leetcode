package com.onjava;

public class 选择排序 {
    public void select_sort(int nums[]){
        int len = nums.length;
        for (int i = 0; i <len-1; i++) {
            int min = i;//每轮记录当前数的下标
            for (int j = i; j < len; j++) {
                //如果发现比当前元素更小的数，那么就把他的下标记录下来
                if(nums[j]<nums[min]){
                    min = j;
                }
            }
            if(min!=i){//如果说找到了后面部分的最小值，那么肯定是走过if()
                int index = nums[min];
                nums[min] = nums[i];
                nums[i] = index;
            }
        }
    }
}
