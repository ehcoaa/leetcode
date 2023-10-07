package leetcode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 字母异位词
 */
public class t02 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> map = new HashMap();
        for (String str : strs) {
            char[] chars = str.toCharArray();//把每个字符串拆分为字符数组
            Arrays.sort(chars);//对字符数组进行排序，目的是如果是一样的字符串，那么经过排序后会变成一样的
           // String key = chars.toString();//字母异位词的key都一样
            String key = new String(chars);
            //String = String.valueOf(chars)
            // map.put(chars.toString(),str); //把排序后的字符数组作为键，原本的字符串作为值存入,但这个值可能是有多个呢？

            //List<String> list = map.get(key); //如果map目前没有这个，则应该返回空的list 而不是null
            List<String> list = map.getOrDefault(key,new ArrayList<>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());//这个操作可以记一下
    }
}
