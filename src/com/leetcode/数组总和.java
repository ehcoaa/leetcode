package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class 数组总和 {

    List<List<Integer>> resList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrace(candidates,target,0,0);
        return resList;
    }

    public void backtrace(int[] candidates,int target,int sum,int startIndex){
        if(sum>target) return;
        if(sum==target) {
            resList.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            list.add(candidates[i]);
            sum += candidates[i];
            //递归
            backtrace(candidates,target,sum,i);
            //回溯
            list.remove(list.size()-1);
            sum-=candidates[i];
        }
    }
}
