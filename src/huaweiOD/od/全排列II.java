package huaweiOD.od;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 * 输入：nums = [1,1,2]
 * 输出：
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 */
public class 全排列II {
    List<List<Integer>> resList= new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrace(nums,used);
        return resList;
    }

    public void backtrace(int[] nums,boolean[] used){
        if(list.size()==nums.length){
            resList.add(new ArrayList<>(list));
            return;
        }
        //单层循环
        for (int i = 0; i < nums.length; i++) {
            if(used[i]==true) continue;//用过不能再用
            //去重剪枝
            if(i>1&&nums[i]==nums[i-1]&&used[i]==false) continue;

            list.add(nums[i]);
            used[i] = true;

            backtrace(nums,used);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }

}
