package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个大小为 n 的整数数组，
 * 找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 */
public class 多数元素2 {

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();//k:值，v:出现的次数
        for (int num : nums) {
            int value =  map.getOrDefault(num,0);
            map.put(num,value+1);
        }

        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if(map.get(key)> nums.length/3){
                list.add(key);
            }
        }
        return list;
    }
}
