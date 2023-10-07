package com.leetcode;

public class 最长回文字串 {
    public  static String longestPalindrome(String s) {
            if(s.length()==0||s==null) return "";
            int left = 0;
            int right = 0;
            int len = 1;
            int maxLength =0;
            int maxStart = 0;
            for(int i=0;i<s.length();i++){
                left  = i-1;//左边
                right = i+1;//右边

                while(left>=0 && s.charAt(left)==s.charAt(i)){
                    left--;
                    len++;
                }
                while(right<s.length() && s.charAt(right)==s.charAt(i)){
                    right++;
                    len++;
                }
                while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                    len = len+2;
                }
                if(len>maxLength){
                    maxLength = len;
                    maxStart = left;
                }
                len = 1;
            }
            return s.substring(maxStart+1,maxStart+maxLength+1);
    }
}
