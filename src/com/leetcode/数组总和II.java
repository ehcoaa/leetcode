package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 数组总和II {

    List<List<Integer>> resList = new ArrayList<>();
    List<Integer> resPath = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used = new boolean[candidates.length];
        Arrays.sort(candidates);
        backtrace(candidates,target,0,0,used);
        return resList;
    }

    public  void backtrace(int[] candidates, int target,int sum,int startIndex,boolean[] used){
        if(sum>target) return;
        if(sum==target) {
            resList.add(new ArrayList<>(resPath));
            return;
        }

        //单层循环
        for (int i = startIndex; i < candidates.length; i++) {
            if(i>=1&&candidates[i]==candidates[i-1]&&used[i-1]==false)
                continue;
            //收集结果
            resPath.add(candidates[i]);
            sum+=candidates[i];
            used[i] = true;//表示用过了
            //递归
            backtrace(candidates,target,sum,i+1,used);
            //回溯
            resPath.remove(resPath.size()-1);
            sum-=candidates[i];
            used[i] = false;
        }
    }
}
