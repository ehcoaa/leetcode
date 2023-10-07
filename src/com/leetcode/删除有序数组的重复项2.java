package com.leetcode;

import java.util.HashMap;

/**
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。
 * 不需要考虑数组中超出新长度后面的元素。
 */
public class 删除有序数组的重复项2 {
    // Hash 方法
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap(); //k：值，v:值出现过的次数

        int l=0;
        int r=l+1;
        map.put(nums[l],1 );

        while (r<nums.length){
            //1.没有出现过
            if(!map.containsKey(nums[r])){
                map.put(nums[r],1);
                nums[l+1] = nums[r];
                l++;
            }
            //2.出现过
            else {
                //2.1出现过一次
                if(map.get(nums[r])==1){
                    map.put(nums[r],2 );
                    nums[l+1] = nums[r];
                    l++;
                }
                //2.2出现过两次 直接跳过就行
            }
            r++;
        }
        return l+1;
    }
}
