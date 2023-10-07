package com.leetcode.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典。
 * 请你判断是否可以利用字典中出现的单词拼接出 s 。
 * 注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
 */
public class 单词拆分 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);//把list中单词放到set中，方便判断是否存在
        char[] string = s.toCharArray();

        int star = 0;
        for (int i = 0; i < string.length; i++) {
            String str = s.substring(star,i+1);
            //可以拆分,把 star换一下，换成下个单词的起始位置
            if(set.contains(str)){
                star = i+1;
            }
        }

        //如果最后全部都拆分的话，
        // 说明 s 的最后一个字母刚好走进了 if 条件语句，
        // 则 star 终值会是 i++的最后值
        return star==s.length();
    }


    public boolean wordBreak0(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                //前面的能拆分&&后面的也能拆分 则为true
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

        public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("leet");
        wordList.add("code");
        System.out.println(wordBreak("leetcode", wordList));
    }
}
