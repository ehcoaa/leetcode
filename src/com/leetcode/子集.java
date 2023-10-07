package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class 子集 {
    List<List<Integer>> resList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrace(nums,0);
        return resList;
    }

    private void backtrace(int[] nums, int startIndex) {
        resList.add(new ArrayList<>(list));
        if(startIndex>=nums.length) return;

        for (int i = startIndex; i < nums.length; i++) {
            list.add(i);
            backtrace(nums,i+1);
            list.remove(list.size()-1);
        }
    }

}
