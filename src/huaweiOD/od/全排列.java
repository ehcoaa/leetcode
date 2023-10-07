package huaweiOD.od;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入：nums = [1,2,3] nums 不含重复数字
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class 全排列 {
    List<List<Integer>> resList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtrace(nums,used);
        return resList;
    }
    public void backtrace(int[] nums,boolean[] used){
        if(list.size()==nums.length){
            resList.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]==true) continue;

            list.add(nums[i]);
            used[i] =true;

            //递归
            backtrace(nums,used);
            //回溯
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}
