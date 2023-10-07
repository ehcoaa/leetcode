package huaweiOD.od;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 */
public class 组合 {
    List<List<Integer>> resList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
           backtrace(n,k,0);
           return resList;
    }
    public void backtrace(int n,int k,int startIndex){
        //终止条件
        if(list.size()==k){
            resList.add(new ArrayList<>(list));
            return;
        }
        //单层循环
        for (int i = startIndex; i <=n; i++) {
            list.add(i);
            backtrace(n,k,startIndex+1);
            list.remove(list.size()-1); //撤销，递归函数之后就是回溯要干的事
        }
    }
    public void backtrace0(int n,int k,int startIndex){
        //终止条件
        if(list.size()==k){
            resList.add(new ArrayList<>(list));
            return;
        }
        //单层循环
        //剪枝 操作 k-list.size 是还差几个 如果这次分支下来剩余的分支少于这个数那就没必要继续了
        for (int i = startIndex; i <=n-(k- list.size())+1; i++) {
            list.add(i);
            backtrace0(n,k,startIndex+1);
            list.remove(list.size()-1); //撤销，递归函数之后就是回溯要干的事
        }
    }
}
