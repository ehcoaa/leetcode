package leetcode100;

import java.util.HashMap;

public class t09 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        char[] chars = s.toCharArray();
        int res = 0;
        int start=0;
        for (int i = 0; i < chars.length; i++) {
            //有重复
            if(map.containsKey(chars[i])){
                start = Math.max(map.get(chars[i])+1,start) ;
            }
            //无重复
            map.put(chars[i],i);
            res = Math.max(res,i-start+1);
        }
        return res;
    }
}
