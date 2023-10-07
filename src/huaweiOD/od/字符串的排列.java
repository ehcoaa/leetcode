package huaweiOD.od;

import java.util.Arrays;

public class 字符串的排列 {
    public static boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2) return false;
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);//字符数组排序-->按照字典规则

        for (int i = 0; i <= l2 - l1; i++) {
            String str = s2.substring(i, i + l1);
            char[] chars2 = str.toCharArray();
            Arrays.sort(chars2);
            if(Arrays.equals(chars1,chars2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }
}
