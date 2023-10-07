package leetcode100;

import java.util.Arrays;
import java.util.HashMap;

//最长连续序列
public class t03 {
    //这个方法不全面
    public int longestConsecutive0(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;  i< nums.length ; i++) {
            //连续很关键
            boolean have = map.containsKey(nums[i]);
            if (have) break;
            boolean left =  map.containsKey(nums[i] - 1);
            boolean right = map.containsKey(nums[i] + 1);
            //说明第一次出现
            if(!left&&!right){//说明这个数还没连接起来 单独一个
                map.put(nums[i],1);//最大长度设为1
            }


            int v1 = map.getOrDefault(nums[i] - 1,0);//左边
            int v2 = map.getOrDefault(nums[i] + 1,0);//右边


            //有左有右  这里注意要改变边界的值
             if(left&&right){
                map.put(nums[i],v1+v2+1);
                int j = 1;
                int k = 1;
                while(map.containsKey(nums[i]-j)){
                    map.put(nums[i]-j,1+v1+v2);
                    j++;
                }

                while (map.containsKey(nums[i]+k)){
                    map.put(nums[i]+k,v1+v2+1);
                    k++;
                }
            }
            //有左无右
            else if(left&&!right){
                map.put(nums[i],v1+1);
                int j = 1;
                while(map.containsKey(nums[i]-j)){
                    map.put(nums[i]-j,1+v1);
                    j++;
                }
            }
            //有右无左
            else if(!left&&right){
                map.put(nums[i],v2+1);
                int k = 1;

                while (map.containsKey(nums[i]+k)){
                    map.put(nums[i]+k,v2+1);
                    k++;
                }
            }

        }
        int max = Integer.MIN_VALUE;
        for (Integer value : map.values()) {
            if(value>max)
                max = value;
        }
        return max;
    }





    public static void main(String[] args) {
        t03 t = new t03();
        int i = t.longestConsecutive0(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        System.out.println(i);
    }

    //直接排序的方法
    private int longestConsecutive(int[] nums) {
        if (nums == null || nums.length==0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxLength =1;
        int currLength=1;
        for (int i = 0; i < nums.length-1; i++) {
            int a = nums[i];
            int b = nums[i+1];
            if(b-a==1){
                currLength++;
                maxLength = Math.max(currLength,maxLength);
            }
            else if(b-a==0){
                continue;
            }
            else
            {
                currLength=1;
            }
        }
        return maxLength;
    }
}
