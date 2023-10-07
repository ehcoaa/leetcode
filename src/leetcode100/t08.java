package leetcode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t08 {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] chars1 = p.toCharArray();
        Arrays.sort(chars1);
        int l = 0;
        int r = p.length()-1;
           for (;r<s.length();r++,l++){
               String temp = s.substring(l,r+1);
               char[] chars = temp.toCharArray();
               Arrays.sort(chars);

               if (Arrays.equals(chars,chars1)){
                   list.add(l);
               }
           }
           return list;
    }

    public static void main(String[] args) {
        String s = "bac";
        String p = "abc";
        char[] s1 = s.toCharArray();
        char[] p1 = p.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(p1);

        System.out.println(s1.equals(p1));


        //System.out.println(findAnagrams(s, p).toArray().toString());
    }
}
